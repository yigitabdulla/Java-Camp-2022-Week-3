package kodlamaio.dataAccess;

import kodlamaio.entities.Courses;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Courses course) {
		System.out.println("Hibernate ile veritabanina eklendi " + course.getCourseName());
		
	}
	
}
