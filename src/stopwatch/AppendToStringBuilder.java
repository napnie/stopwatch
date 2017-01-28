package stopwatch;

/**
 * An implements class of append char to StringBuilder task.
 * @author Nitith Chayakul
 * @since Jan 28, 2017
 *
 */
public class AppendToStringBuilder implements Runnable {
	private int count;
	private int length;
	
	/**
	 * Initialize a AppendToStringBuilder.
	 * @param count is number of char to append to StringBuilder.
	 */
	public AppendToStringBuilder(int count){
		this.count = count;
	}
	
	/**
	 * Append char to StringBuilder.
	 */
	public void run(){
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		String result = builder.toString();
		length = result.length();
	}
	
	/**
	 * @return String of append to StringBuilder task name with a number of char and result.
	 */
	public String toString(){
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d",count,length);
	}
}
