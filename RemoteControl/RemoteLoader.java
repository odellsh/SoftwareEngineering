public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff = new StereoOffCommand(stereo);

		HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
		HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);
		HottubIncrementTemperature hottubIncrementTemperature = new HottubIncrementTemperature(hottub);
		HottubDecrementTemperature hottubDecrementTemperature = new HottubDecrementTemperature(hottub);
		
        Command[] PartyOn = {hottubOnCommand, livingRoomLightOn, kitchenLightOn, stereoOnWithCD};
        Command[] PartyOff = {hottubOffCommand, livingRoomLightOff, kitchenLightOff, stereoOff};
        
        DisplayLog displayLog = new DisplayLog(remoteControl);
		NoCommand noCommand = new NoCommand();

        MacroCommand partyOnMacro = new MacroCommand(PartyOn);
        MacroCommand partyOffMacro = new MacroCommand(PartyOff);
         
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, hottubOnCommand, hottubOffCommand);
		remoteControl.setCommand(5, hottubIncrementTemperature, hottubDecrementTemperature);
		remoteControl.setCommand(6, partyOnMacro, partyOffMacro);
        remoteControl.setCommand(7, noCommand, displayLog);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButtonWasPushed();
		//remoteControl.offButtonWasPushed(6);
	}
}
