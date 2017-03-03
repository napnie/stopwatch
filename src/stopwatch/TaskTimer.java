package stopwatch;

/**
 * TaskTimer is a runner to get elapsed time of a running task.
 * @author Nitith Chayakul
 * @since Jan 28, 2017
 *
 */
public class TaskTimer {
	private Stopwatch watch;
	
	/**
	 * Initialize a TaskTimer.
	 */
	public TaskTimer(){
		watch = new Stopwatch();
	}
	
	/**
	 * Run the task and measure the elapse time.
	 * @param task is a task object that you want to measure elapse time
	 */
	public void measureAndPrint(Runnable task){
		watch.start();
		task.run();
		watch.stop();
		System.out.println(task.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", watch.getElapsed());
	}
}
