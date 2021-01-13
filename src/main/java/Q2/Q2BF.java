package Q2;

/*
  This is my solution for the problem in question2.txt using brute force approach
 */
public class Q2BF {

  public static void main(String[] args){

    int [][] rectangles = {{1,1,5,5},{3,3,8,7},{4,4,7,6}};
    System.out.println(getAtLeastKVisitors(rectangles,2));

  }

  /*  This method solves the problem described in question2.txt file
      Time Complexity: O(n^3)
      Space Complexity: O(n^2)
   */
  static public int getAtLeastKVisitors(int[][] rectangles, int k) {
     int board[][] = new int[110][110];

     if(k>rectangles.length)
       return 0;

     int counter[] = new int[rectangles.length+1];

      for(int[] rectangle : rectangles){
        for(int i = rectangle[0]; i <= rectangle[2]; i++){
          for(int j = rectangle[1]; j <= rectangle[3]; j++){
            counter[++board[i][j]]++;
          }
        }
    }
    return counter[k];
  }

}