package kodlamaio.dataAccess;

import kodlamaio.entities.Courses;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Courses course) {
		System.out.println("Jdbc ile veritabanina eklendi" + course.getCourseName());
		
	}
	
}
