package stopwatch;

/**
 * An implements class of append char to string task.
 * @author Nitith Chayakul
 * @since Jan 28, 2017
 */
public class AppendToString implements Runnable {
	private int count;
	private int length;
	
	/**
	 * Initialize AppendToString class.
	 * @param count is a number of char to append to string.
	 */
	public AppendToString(int count){
		this.count = count;
	}
	
	/**
	 * Append char to string.
	 */
	public void run(){
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count){
			result = result + CHAR;
		}
		length = result.length();
		
	}
	
	/**
	 * @return String of append to string task name with a number of char and result.
	 */
	public String toString(){
		return String.format("Append %,d chars to String\nfinal string length = %d",count,length);
	}
}
