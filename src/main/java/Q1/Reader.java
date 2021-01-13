package Q1;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
  This class read the files and update the data in memory
 */
public class Reader implements Runnable{

  private static final String EXCHANGE_PATH = "tmp/exchange/";
  private static Logger logger = Logger.getLogger(Q1.class.getName());

  private static HashMap<String,Float> conversions = new HashMap<>();
  private static Set<String> versions = new HashSet<>();

  private static final JsonFactory factory = new JsonFactory();
  private static final ObjectMapper mapper = new ObjectMapper(factory);

  public void run(){

      File file = new File(EXCHANGE_PATH + "buildID.txt");
      Build build = null;

      try {
        build = mapper.readValue(file, Build.class);
      } catch (JsonParseException ex) {
        logger.log(Level.SEVERE, "Exception parsing the build file", ex.getMessage());
      } catch (JsonMappingException ex) {
        logger.log(Level.SEVERE, "Exception mapping the build file", ex.getMessage());
      } catch (IOException ex){
        logger.log(Level.SEVERE, "Exception occur reading the build file", ex.getMessage());
      }

      if(versions.contains(build.getBuildID())){
        logger.info("Build version already checked");
        return;
      }

      versions.add(build.getBuildID());

      file = new File(EXCHANGE_PATH + build.getFileName());

      try {
        JsonNode rootNode = mapper.readTree(file);

        Iterator<Entry<String, JsonNode>> fieldsIterator = rootNode.fields();

        while (fieldsIterator.hasNext()) {
          Entry<String, JsonNode> field = fieldsIterator.next();
          conversions.put(field.getKey(), Float.parseFloat(field.getValue().toString()));
        }

        logger.info("Current conversions rate:" + conversions.toString());
      } catch (JsonProcessingException ex) {
        logger.log(Level.SEVERE, "Exception occur processing the currencies file", ex.getMessage());
      } catch (IOException ex) {
        logger.log(Level.SEVERE, "Exception occur reading the currencies file", ex.getMessage());
      }
    }

  }
