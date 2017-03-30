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
	/** time that stopwatch is stop, in nanoseconds. */
	private long stop;
	/** elapsed time between start time and stop time, in seconds. */
	private double duration;
	/** Constant for converting nanoseconds to seconds. */
	private final double NANOSECOND = 1.0E-9;
	
	private StopwatchState state;
	private final StopwatchState RUNNING = new RunningState();
	private final StopwatchState STOPPED = new StoppedState();

	public Stopwatch() {
		setState( STOPPED );
	}
	
	/**
	 * @see StopwatchState#start()
	 */
	public void start() {
		state.start();
	}
	
	/**
	 * @see StopwatchState#stop()
	 */
	public void stop() {
		state.stop();
	}

	/** @return true if Stopwatch is running */
	public boolean isRunning() {
		return state == RUNNING;
	}

	/**
	 * @see StopwatchState#getElapsed()
	 * @return
	 */
	public double getElapsed(){
		return state.getElapsed();
	}
	
	private void setState( StopwatchState state ) {
		this.state = state;
	}
	
	interface StopwatchState {

		/** Start the stopwatch if it is not running. */
		public void start() ;
		
		/** Stop the stopwatch if it is running. */
		public void stop() ;

		/** @return elapsed time between start time and stop time or present time if it is running, in senconds with decimal. */
		public double getElapsed() ;
	}
	
	public class RunningState implements StopwatchState {
		
		/**
		 * @see StopwatchState#start()
		 */
		public void start() {
			// nothing to do
		}
		
		/**
		 * @see StopwatchState#stop()
		 */
		public void stop() {
			stop = System.nanoTime();
			duration = (stop-start)*NANOSECOND;
			setState( STOPPED );
		}

		/**
		 * @see StopwatchState#getElapsed()
		 */
		public double getElapsed(){
			return (System.nanoTime()-start)*NANOSECOND;
		}
	}
	
	public class StoppedState implements StopwatchState {
		
		/** @see StopwatchState#start() */
		public void start() {
			start = System.nanoTime();
			setState( RUNNING );
		}
		
		/**
		 * @see StopwatchState#stop()
		 */
		public void stop() {
			// nothing to do
		}

		/**
		 * @see StopwatchState#getElapsed()
		 */
		public double getElapsed(){
			return duration;
		}
	}
}
