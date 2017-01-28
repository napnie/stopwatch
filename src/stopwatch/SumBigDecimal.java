package stopwatch;

import java.math.BigDecimal;

/**
 * An implements class of sum a BigDecimal task.
 * @author Nitith Chayakul
 * @since Jan 28, 2017
 *
 */
public class SumBigDecimal implements Runnable{
	private int counter;
	private BigDecimal sum;
	private final int ARRAY_SIZE = 500000;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];

	/**
	 * Initialize SumBigDecimal task.
	 * @param counter is a number of BigDecimal that you want to sum.
	 */
	public SumBigDecimal(int counter){
		this.counter = counter;
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
	}
	
	/**
	 * Sum a BigDecimal.
	 */
	public void run(){
		sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	/**
	 * @return String of a sum BigDecimal task name with counter and BidDecimal sum.
	 */
	public String toString(){
		return String.format("Sum array of BigDecimal with count=%,d\nsum = "+sum,counter);
	}
}
