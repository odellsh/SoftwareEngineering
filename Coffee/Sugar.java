public class Sugar extends CondimentDecorator{
    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Sugar";
    }

    public double cost(){
        return .00 + beverage.cost();
    }
}
