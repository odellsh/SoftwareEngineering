import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){

		WizardTowerProxy wtp = new WizardTowerProxy(new IvoryTower());
		Scanner in = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = in.nextLine();
		System.out.println("Great! Now please enter the number of credits you possess:");
		String cred = in.nextLine();
		int credits = Integer.parseInt(cred);

		Wizard wiz = new Wizard(name, credits);

		System.out.println("\nDo you wish to enter the tower?\nPlease type yes or no");
		String enter = in.nextLine();
		if(enter == "yes" || enter == "Yes"){
			wtp.enter(wiz);
		}
		else{
			System.out.println("Nice try! Come back when you have enough credits");
		}

	}
}
