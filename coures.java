package freddy;
import java.util.Scanner;
public class coures {

	
	Scanner coures = new Scanner(System.in);
	
	private String room;
	private String condition;
	private int numberofpeople;
	
	public coures(String room,String condition,int numberofpeople) {
		this.room = room;
		this.condition = condition;
		this.numberofpeople = numberofpeople;
		
	}
	public String gitRoom() {
		return room;
	}
	public String gitcondition() {
		return condition;
	}
	public int gitnumberofpeople() {
		return numberofpeople;
	}
	
	public String toString(){
		
		return "coures room"+this.room+"coures condition"+this.condition+
				"coures numberofpeople"+this.numberofpeople;
				
	}
	
	
	
	
}
