package comm.example;

public class Student extends Person {
	private String stream;
	
	public Student() {
		
		
	}
	
    public Student(String stream) {
	this.stream=stream;
		
	}


   public String getStudentDetails() {
	return getDetails()+" stream :"+stream;
}

}
