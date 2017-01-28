package stopwatch;

/**
 * Stopwatch that measure elapsed time between start time and stop time
 * or until the present time.
 * @author Nitith Chayakul
 * @since Jan 28, 2017
 * 
 */
public class Stopwatch {
	/** time that stopwatch is start, in nanoseconds. */
	private long start;
	/** time that stopwatch is stop, in nanoseonds. */
	private long stop;
	/** elapsed time between start time and stop time, in seconds. */
	private double duration;
	/** stopwatch's status, true if it is running. */
	private boolean isRunning=false;
	/** constatnt for converting nanoseconds to seconds. */
	private final double NANOSECOND = 1.0E-9;

	/** Start the stopwatch if it is not running. */
	void start(){
		if (!isRunning){
			start = System.nanoTime();
			isRunning = true;
		}
	}
	
	/** Stop the stopwatch if it is running. */
	void stop(){
		if (isRunning){
			stop = System.nanoTime();
			isRunning = false;
			duration = (stop-start)*NANOSECOND;
		}
	}

	/** @return true if Stopwatch is running */
	boolean isRunning(){
		return isRunning;
	}

	/** @return elapsed time between start time and stop time or present time if it is running, in senconds with decimal. */
	double getElapsed(){
		if (isRunning){
			return (System.nanoTime()-start)*NANOSECOND;
		}else{
			return duration;
		}
	}
}
