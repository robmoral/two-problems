import Q2.Q2BF;
import org.junit.Assert;
import org.junit.Test;

public class Q2BFTest {

  @Test
  public void test1BF(){
    int[][] results = Data.test1Results;
    int[][] rectangles = Data.test1;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test2BF(){
    int[][] results = Data.test2Results;
    int[][] rectangles = Data.test2;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test3BF(){
    int[][] results = Data.test3Results;
    int[][] rectangles = Data.test3;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test4BF(){
    int[][] results = Data.test4Results;
    int[][] rectangles = Data.test4;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test5BF(){
    int[][] results = Data.test5Results;
    int[][] rectangles = Data.test5;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test6BF(){
    int[][] results = Data.test6Results;
    int[][] rectangles = Data.test6;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test7BF(){
    int[][] results = Data.test7Results;
    int[][] rectangles = Data.test7;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test8BF(){
    int[][] results = Data.test8Results;
    int[][] rectangles = Data.test8;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test9BF(){
    int[][] results = Data.test9Results;
    int[][] rectangles = Data.test9;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }

  @Test
  public void test10BF(){
    int[][] results = Data.test10Results;
    int[][] rectangles = Data.test10;
    for(int[] test: results) {
      Assert.assertEquals(test[1], Q2BF.getAtLeastKVisitors(rectangles, test[0]));
    }
  }


}
