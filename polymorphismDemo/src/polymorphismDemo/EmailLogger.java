package polymorphismDemo;

public class EmailLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Email'e loglandi " + message);
	}
}
