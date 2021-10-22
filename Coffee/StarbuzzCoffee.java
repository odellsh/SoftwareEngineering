public class StarbuzzCoffee {
 
    public static void main(String args[]) {
        
        Beverage beverage = new VarietalBlend(); 
        beverage = new Sugar(beverage);    
        beverage = new Milk(beverage); 
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()
                + " $" + Math.round(beverage.cost() * 100.0)/100.0);

//        Beverage beverage2 = new HouseBlend();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Whip(beverage2);
//        System.out.println(beverage2.getDescription() 
//                + " $" + beverage2.cost());
    
    }
}
