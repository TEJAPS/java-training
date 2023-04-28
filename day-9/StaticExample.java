// can we use non-static method in the static method?
// can we use instance specific logic in the common logic?

// can we use static method in the non-static method?
// can we use common logic in the instance specific logic?

class Student{
	public String name; // 1 space
	int rollNumber; // 1 space
	// static  = its common for all the instances of the class
	public static String collegeName; // 1 space
	
	Student(String iname, int irollNumber){
		name = iname;
		rollNumber = irollNumber;
	}

	Student(String iname, int irollNumber, String icollegeName){
		name = iname;
		rollNumber = irollNumber;
		collegeName = icollegeName;
	}
	
	public void printStudentDetail(){
		//System.out.println(getCollegeName());
		System.out.println("Student details are , name: " + name + ", rollNumber : " + rollNumber + " , collegeName: " + collegeName);
	}
	
	public static String getCollegeName(){
		//printStudentDetail();
		return collegeName;
	}
}

class Main{
	public static void main(String args[]){
		
		Student.collegeName = "youtube";
		String result = Student.getCollegeName();
		//Student.printStudentDetail();
		System.out.println(result);
		
		//Student s1 = new Student("dpoint",2,"youtube");
		Student s1 = new Student("dpoint",2);
		//s1.collegeName = "youtube";
		s1.printStudentDetail();
		System.out.println(s1.getCollegeName());
		
		//Student s2 = new Student("anil",5,"youtube");
		Student s2 = new Student("anil",5);
		//s1.collegeName = "abcd";
		s2.printStudentDetail();
		
		//Student s3 = new Student("bharat",6,"youtube");
		Student s3 = new Student("bharat",6);
		s3.printStudentDetail();
	}
}