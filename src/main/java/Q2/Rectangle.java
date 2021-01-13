package Q2;

import static java.lang.Integer.compare;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Rectangle implements Comparable<Rectangle>
{

  private int [] coordinates;

  Rectangle(int x1, int y1, int x2, int y2){
    coordinates = new int[4];
    coordinates[0] = x1;
    coordinates[1] = y1;
    coordinates[2] = x2;
    coordinates[3] = y2;
  }

  //Sorted by y1,y2
  @Override
  public int compareTo(Rectangle anotherRectangle){
    if(this.coordinates[1] != anotherRectangle.coordinates[1])
      return compare(this.coordinates[1], anotherRectangle.coordinates[1]);
    if(this.coordinates[3] != anotherRectangle.coordinates[3])
      return compare(this.coordinates[3], anotherRectangle.coordinates[3]);
    return 1;//Support repeated coordinates
  }

  @Override
  public String toString(){
    return Arrays.toString(coordinates);
  }

  public int getX1(){
    return coordinates[0];
  }

  public int getX2(){
    return coordinates[2];
  }

  public int getY1(){
    return coordinates[1];
  }

  public int getY2(){
    return coordinates[3];
  }


}