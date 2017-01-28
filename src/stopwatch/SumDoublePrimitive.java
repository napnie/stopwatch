package stopwatch;

/**
 * An implements class of sum a double primitive task.
 * @author Nitith Chayakul
 * @since Jan 28, 2017
 *
 */
public class SumDoublePrimitive implements Runnable {
	private int counter;
	private double sum;
	private final int ARRAY_SIZE = 500000;
	private double[] values = new double[ARRAY_SIZE];
	
	/**
	 * Initialize SumDoublePrimitive task.
	 * @param counter is a number of double primitive that you want to sum.
	 */
	public SumDoublePrimitive(int counter){
		this.counter = counter;
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;
	}
	
	/**
	 * Sum a double primitive.
	 */
	public void run(){
		sum = 0.0;
		// count = loop counter, i = array index value
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
	}
	
	/**
	 * @return String of sum double primitive task name with counter and double primitive sum.
	 */
	public String toString(){
		return String.format("Sum array of double primitives with count=%,d\nsum = "+sum,counter);
	}
}
