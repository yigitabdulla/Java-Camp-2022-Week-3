package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	public List<String> categoryName = new ArrayList<String>();
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		
	}
	
	public void add(Category category) throws Exception {
		
		if(categoryName.contains(category.getCategoryName())) {
			throw new Exception("Kategori zaten mevcut!");
		}
		
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	
}
