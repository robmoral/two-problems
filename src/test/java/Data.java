/*
  This class holds the data for the tests
 */
public class Data {

  private Data(){
  }

  //One single rectangle
  static int[][] test1 = {{0,0,4,4}};
  static int[][] test1Results = {{1,25},{2,0}};

  ////Sample case
  static int [][] test2 = {{0,0,4,4},{1,1,2,5}};
  static int [][] test2Results = {{1,27},{2,8}};

  //Crossing only the corners
  static int [][] test3 = {{0,0,1,1},{1,1,2,2}};
  static int [][] test3Results = {{1,7},{2,1}};

  //One rectangle above other
  static int [][] test4 = {{0,0,1,1},{0,1,1,2}};
  static int [][] test4Results = {{1,6},{2,2}};

  //Three rectangles nested
  static int [][] test5 = {{0,0,4,4},{0,0,3,3},{0,0,2,2}};
  static int [][] test5Results = {{1,25},{2,16},{3,9}};

  //Three rectangles each one next to other in x-axis
  static int [][] test6 = {{0,0,1,2},{1,0,2,2},{2,0,3,2}};
  static int [][] test6Results = {{1,12},{2,6}};

  //Random case
  static int [][] test7 = {{1,1,5,5},{3,3,8,7},{4,4,7,6}};
  static int [][] test7Results = {{1,46},{2,17},{3,4}};

  //Same rectangle
  static int[][] test8 = {{0,0,4,4},{0,0,4,4},{0,0,4,4}};
  static int[][] test8Results = {{1,25},{2,25},{3,25},{4,0}};

  //Four squares
  static int[][] test9 = {{0,0,50,50},{50,0,100,50},{0,50,50,100},{50,50,100,100}};
  static int[][] test9Results = {{1,10201},{2,201},{3,1},{4,1},{5,0}};

  //Multiple rectangles nested
  static int [][] test10 = {{0,0,7,7},{0,0,6,6},{0,0,5,5},{0,0,4,4},{0,0,3,3},{0,0,2,2},{0,0,1,1}};
  static int [][] test10Results = {{1,64},{2,49},{3,36},{4,25},{5,16},{6,9},{7,4},{8,0}};

}