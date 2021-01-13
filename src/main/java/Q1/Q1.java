package Q1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
  This class is the entry file for the question1.
 */
public class Q1 {

  public static void main(String []args){

    //The thread will run each 1 minute
    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    scheduler.scheduleAtFixedRate( new Reader(), 0, 1, TimeUnit.MINUTES);

  }

}
