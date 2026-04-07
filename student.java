package freddy;

public class student {

	private int age;
	private int number;
	private String name;

	public student(int age,int number,String name) {
		this.age = age;
		this.number = number;
		this.name = name;


	}

	public String toString() {

		return "Student age: "+this.age+"Student name"+this.name+"student number"+this.number; 
	

	}	  
}