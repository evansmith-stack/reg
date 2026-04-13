package freddy;

import java.util.Scanner;

public class student {



	Scanner student = new Scanner(System.in);
	private int age;
	private int number;
	private String name;

	public student(int age,int number,String name) {
		this.age = age;
		this.number = number;
		this.name = name;


	}
	public int gitage() {
		return age;
	}
	public int gitnumber() {
		return number;
	}
   public String gitname() {
	   return name;
   }
	public String toString() {

		return "Student age: "+this.age+"Student name"+this.name+"student number"+this.number; 
	}



}



