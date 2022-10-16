package kodlamaio.dataAccess;

import kodlamaio.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Hibernate ile veritabanina eklendi");
		
	}

}
