import Q2.Q2;
import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

  @Test
  public void test1(){
    int[][] results = Data.test1Results;
    int[][] rectangles = Data.test1;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test2(){
    int[][] results = Data.test2Results;
    int[][] rectangles = Data.test2;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test3(){
    int[][] results = Data.test3Results;
    int[][] rectangles = Data.test3;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test4(){
    int[][] results = Data.test4Results;
    int[][] rectangles = Data.test4;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test5(){
    int[][] results = Data.test5Results;
    int[][] rectangles = Data.test5;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test6(){
    int[][] results = Data.test6Results;
    int[][] rectangles = Data.test6;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test7(){
    int[][] results = Data.test7Results;
    int[][] rectangles = Data.test7;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test8(){
    int[][] results = Data.test8Results;
    int[][] rectangles = Data.test8;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test9(){
    int[][] results = Data.test9Results;
    int[][] rectangles = Data.test9;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test10(){
    int[][] results = Data.test10Results;
    int[][] rectangles = Data.test10;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

}
