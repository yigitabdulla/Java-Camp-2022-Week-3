package kodlamaio.entities;

public class Courses {
	private String courseName;
	private double coursePrice;
	
	public Courses(String courseName,double coursePrice) {
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
}
