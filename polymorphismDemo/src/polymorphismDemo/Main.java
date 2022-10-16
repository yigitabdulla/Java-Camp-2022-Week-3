package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = {new FileLogger(), new EmailLogger(), new DataBaseLogger()};
		for(BaseLogger logger:loggers) {
			logger.log("Work");
		}
		
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.add();
	}

}
