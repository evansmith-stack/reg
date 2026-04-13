package freddy;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class registration {
	static ArrayList<student> kids;


	public static void main(String[] args) {
		kids = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Random  random = new Random();
		student evan = new student(16,4,"evan");
		student ava = new student(20,3,"ava");
		student liz = new student(23,2,"liz");
		student wyatt = new student(26,1,"wyatt");

		coures computers = new coures("computers","looksgoodandthebestclass",4);
		coures math = new coures("math","lookslikecrap",4);

		kids.add(evan);
		kids.add(ava);
		kids.add(liz);
		kids.add(wyatt);

		printStudent();


	}

	public static void printStudent() {
		for (student s : kids) {
			System.out.println(s);


		}
	}

	public boolean isHere(String name) {

		return true; 
	}
}