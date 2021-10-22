import java.util.ArrayList;
public class IvoryTower implements WizardTower{
	ArrayList<Wizard> wizardList = new ArrayList<Wizard>();

	public void enter(Wizard wizard){
		wizardList.add(wizard);
		System.out.println("Welcome");
	}

	public void exit(Wizard wizard){
		wizardList.remove(wizard);
		System.out.println("Goodbye");
	}
}