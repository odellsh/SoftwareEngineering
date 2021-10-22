public class Hottub {
    boolean on;
    int temperature = 105;

    public Hottub() {
    }

    public void on() {
        on = true;
        System.out.println("Hottub in now on.");
    }

    public void off() {
        on = false;
        System.out.println("Hottub in now off.");
    }

    public void bubblesOn() {
        if (on) {
            System.out.println("Hottub is bubbling!");
        }
    }

    public void bubblesOff() {
        if (on) {
            System.out.println("Hottub is not bubbling");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("Hottub jets are on");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("Hottub jets are off");
        }
    }

    public void setTemperature(int temperature) {
        if (temperature >+ 80 && temperature <= 110)
            this.temperature = temperature;
        System.out.println("Current temperature: " + this.temperature);
    }
    
    public void incrementTemperature() {
        System.out.print("Incrementing hottub temperature. ");
        setTemperature(temperature+1);
    }
    
    public void decrementTemperature() {
        System.out.print("Decrementing hottub temperature. ");
        setTemperature(temperature-1);
    }
    
    public void heat() {
        setTemperature(105);
    }

    public void cool() {
        setTemperature(98);
    }

}
