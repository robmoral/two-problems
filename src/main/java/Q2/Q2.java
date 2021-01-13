package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/*
  This is my solution for the problem in question2.txt
 */
public class Q2 {

  public static void main(String []args){

    int [][] rectangles = {{0,0,7,7},{0,0,6,6},{0,0,5,5},{0,0,4,4},{0,0,3,3},{0,0,2,2},{0,0,1,1}};
    System.out.println(getAtLeastKVisitors(rectangles,3));

  }

  /*  This method solves the problem described in question2.txt file
      Time Complexity: O(n^2log(n))
      Space Complexity: O(n)
      This method also assumes that input arrays are valid and
      within the range described in question2.txt
  */
  static public int getAtLeastKVisitors(int[][] rectangles, int k) {

    if(rectangles.length==0)
      return 0;
    if(k > rectangles.length)
      return 0;

    TreeSet<Rectangle> avlTree = new TreeSet<>();//To store the rectangles ordered
    TreeSet<Integer> Ys = new TreeSet<>();

    for(int[] coordinates: rectangles) {
      //x2 = x2 + 1 , y2 = y2 +1 for the inclusive constraints
      Rectangle r = new Rectangle(coordinates[0], coordinates[1], coordinates[2]+1, coordinates[3]+1);
      avlTree.add(r);
      if(!Ys.contains(r.getY1()))
        Ys.add(r.getY1());
      if(!Ys.contains(r.getY2()))
        Ys.add(r.getY2());
    }

    int ans = 0;
    Iterator<Integer> yIterator = Ys.iterator();
    int previousY = yIterator.next();

    //Traverse by slices of Y's
    while(yIterator.hasNext()) {

      int currentY = yIterator.next();
      List<int[]> segments = new ArrayList<>();
      Iterator<Rectangle> treeIterator = avlTree.iterator();

      //Look for the rectangles that fall in the slice and create a segment's list
      while(treeIterator.hasNext()) {
        Rectangle r = treeIterator.next();
        //We stop traversing the tree once the rectangles are completely above the slice
        if(r.getY1()>currentY)
          break;
        if(r.getY1()<= previousY && r.getY2()>=currentY) {
          int[] segmentL = new int[2];  int[] segmentR = new int[2];
          segmentL[0] = r.getX1(); segmentL[1] = Type.OPEN.getValue();
          segmentR[0] = r.getX2(); segmentR[1] = Type.CLOSED.getValue();
          segments.add(segmentL); segments.add(segmentR);
        }
        //We remove the rectangles that are left behind by the slice
        if(r.getY2() < previousY)
          treeIterator.remove();
      }

      //Sort the segments to analyze them
      Collections.sort(segments, (a, b) -> Integer.compare(a[0], b[0]));
      Iterator<int[]> it = segments.iterator();
      int[] segmentEnd, segmentStart = it.next();
      int nRectangles = Type.OPEN.getValue(); //The first interval will always be opening

      while(it.hasNext()) {
        segmentEnd = it.next();
        if(nRectangles >=k) {
          ans+= (currentY - previousY) * (segmentEnd[0] - segmentStart[0]);
        }
        segmentStart = segmentEnd;
        nRectangles += segmentEnd[1];
      }

      previousY = currentY;
    }

    return ans;
  }

}