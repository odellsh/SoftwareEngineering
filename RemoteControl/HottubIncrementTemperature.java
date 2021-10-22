public class HottubIncrementTemperature implements Command {
	Hottub hottub;

	public HottubIncrementTemperature(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.incrementTemperature();
	}
	public void undo() {
		hottub.decrementTemperature();
	}
}
