package polymorphismDemo;

public class DataBaseLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Database'ye loglandi " + message);
	}
}