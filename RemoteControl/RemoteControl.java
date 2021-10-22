import java.util.*;

//
// This is the invoker
//
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
    int indexUndo = 0;
	ArrayList<Command> commandLog;
 
	public RemoteControl() {
		onCommands = new Command[8];
		offCommands = new Command[8];
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < 8; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		commandLog = new ArrayList<Command>();
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		commandLog.add(onCommands[slot]);
        indexUndo = commandLog.size();
        System.out.println(indexUndo);  //prints the number of indexes
    }
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		commandLog.add(offCommands[slot]);
        indexUndo = commandLog.size();
        System.out.println(indexUndo);  //prints the number of indexes
    }
	
	public void undoButtonWasPushed() {
        if(indexUndo == 0){                         //if indexUndo is 0
            System.out.println("Nothing to undo");  //print that we cannot do anything
        }   
        else{
            commandLog.get(indexUndo - 1).undo();      //else undo
            indexUndo--;                    //and decrement indexUndo
            System.out.println(indexUndo);
        }
    }
     
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
	
	public ArrayList<Command> getCommandLog() {
	    return commandLog;
	}
}
