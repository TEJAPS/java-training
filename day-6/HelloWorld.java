public class HelloWorld {
	public static void main(String args[]){
		System.out.println("hello world is working");
		
		//Person person = new Person();
		
		//Person person = new Person("bharat");
		
		//Person person = new Person(10);
		
		Person person = new Person("bharat",10);
		Person person = new Person(10,"bharat");
		
		//person.setName("bharat");
		//person.setAge(10);
		//person.initialize("bharat",10);
		
		System.out.println("name :" + person.getName());
		System.out.println("age :" + person.getAge());
		
		
		Person person2 = new Person();
		Person person = new Person("karthik",9);
		System.out.println("name :" + person2.getName());
		System.out.println("age :" + person2.getAge());
		
	}
}