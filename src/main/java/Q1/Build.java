package Q1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
  This class is used to easily read the json file.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Build {

  private String buildID;

  @JsonProperty("FileName")
  private String FileName;

  @JsonProperty("Version")
  private String Version;

}
