package freddy;

public class coures {

	private String room;
	private String condition;
	private int numberofpeople;
	
	public coures(String room,String condition,int numberofpeople) {
		this.room = room;
		this.condition = condition;
		this.numberofpeople = numberofpeople;
		
	}
	public String toString(){
		
		return "coures room"+this.room+"coures condition"+this.condition+
				"coures numberofpeople"+this.condition;
				
	}
	
	
	
	
}
