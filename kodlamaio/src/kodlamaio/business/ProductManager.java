package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.ProductDao;
import kodlamaio.entities.Courses;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public String[] courseNames = {"Java Camp",".net Camp","Html Camp"};
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
		
	}

	public void add(Courses course) throws Exception {
		
		
		
		for(int i=0;i<courseNames.length;i++) {
			if(courseNames[i].equals(course.getCourseName())) {
				throw new Exception("Kurs mevcut");
			}
		}
		
		if(course.getCoursePrice()<0) {
			throw new Exception("Kurs fiyati 0'dan kucuk olamaz");
		}
		
		productDao.add(course);
		
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}
	
}
