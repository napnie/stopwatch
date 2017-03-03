package stopwatch;

/**
 * Main class to call TaskTimer to perform a task involving
 * append char to String, StringBuilder
 * and sum a double primitive, Double, BigDecimal
 * @author Nitith Chayakul
 * @since Jan 28, 2017
 *
 */
public class main {
	public static void main (String [] args){
		TaskTimer taskRunner = new TaskTimer();
		
		AppendToString task1 = new AppendToString(50000);
		AppendToString task2 = new AppendToString(100000);
		AppendToStringBuilder task3 = new AppendToStringBuilder(100000);
		int counter = 1000000000;
		SumDoublePrimitive task4 = new SumDoublePrimitive(counter);
		SumDouble task5 = new SumDouble(counter);
		SumBigDecimal task6 = new SumBigDecimal(counter);
		
		taskRunner.measureAndPrint(task1);
		taskRunner.measureAndPrint(task2);
		taskRunner.measureAndPrint(task3);
		taskRunner.measureAndPrint(task4);
		taskRunner.measureAndPrint(task5);
		taskRunner.measureAndPrint(task6);
	}

}
