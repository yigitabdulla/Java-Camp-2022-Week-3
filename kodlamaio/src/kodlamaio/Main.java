package kodlamaio;

import kodlamaio.business.ProductManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.JdbcProductDao;
import kodlamaio.entities.Courses;

public class Main {

	public static void main(String[] args) throws Exception {
		Courses course1 = new Courses("C++",20);
		
		Logger[] loggers = {new MailLogger()};
		
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(course1);
	}

}
