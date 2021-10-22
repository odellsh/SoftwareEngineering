import java.util.ArrayList;
public class WizardTowerProxy implements WizardTower{
	public ArrayList<Wizard> wizardList = new ArrayList<Wizard>();
	public int wizardTotal = 0;
	public int numCredits;
    private WizardTower tower;

	public WizardTowerProxy(WizardTower tower){
		this.tower = tower;
	}

	public void enter(Wizard wizard){
		numCredits = wizard.getCredits(); // give numCredits 

		if(numCredits < 100) //if the number of credits is less than 100
			System.out.println("Not even credits to get in. Try again later"); //tell them why they cant enter
		else if(wizardTotal == 4) //if the number of wizards is already max
			System.out.println("There are already a max number of wizards. Try again later"); //tell them why they cant enter
		else if(numCredits >= 100 && wizardTotal <= 4){ //if there is room and enough credits
			wizardList.add(wizard); //add the wizard to the list
			wizardTotal++; //increment the wizard total
			tower.enter(wizard); //and let the wizard enter the tower
		}
	}

	public void exit(Wizard wizard){
		if(wizardList.contains(wizard)){ //if the wizardList contains the wizard 
			wizardList.remove(wizard); //remove the wizard from the list
			wizardTotal--; //decrement the wizardTotal
			System.out.println("Wizard " + wizard.toString() + " has exited the tower."); //tell everyone they exited
			tower.exit(wizard); //and let the wizard exit
		}
		else //else if the wizard isnt in the list
			System.out.println("Seriously? I'm an archwizard. I know you are not in the tower.");
	}
}
