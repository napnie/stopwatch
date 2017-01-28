package stopwatch;

/**
 * An impements class of sum Double task.
 * @author Nitith Chayakul
 *
 */
public class SumDouble implements Runnable{
	private int counter;
	private Double sum;
	private final int ARRAY_SIZE = 500000;
	private Double[] values = new Double[ARRAY_SIZE];
	
	/**
	 * Initialize SumDouble task.
	 * @param counter is a number of Double that you want to sum.
	 */
	public SumDouble(int counter){
		this.counter = counter;
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new Double(i+1);
	}
	
	/**
	 * Sum a Double.
	 */
	public void run(){
		sum = new Double(0.0);
		// count = loop counter, i = array index
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum + values[i];
		}
	}
	
	/**
	 * @return String of a sum Double task name with counter and double sum.
	 */
	public String toString(){
		return String.format("Sum array of Double objects with count=%,d\nsum = "+sum,counter);
	}
}
