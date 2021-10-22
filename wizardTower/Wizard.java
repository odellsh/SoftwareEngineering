public class Wizard{
	public String name;
	public int credits;

	public Wizard(String name, int credits){
		this.name = name;
		this.credits = credits;
	}

	public String getName(){
		return name;
	}
	public int getCredits(){
		return credits;
	}
	public void setCredits(int number){
		credits = number;
	}

	public String toString(){
		return name;
	}
}