package Pizza;

public class PizzaClient {
    public void run(){
        Pizza round = new Pizza(29.4, new Circle(4.6));
        Pizza rect = new Pizza(29.3, new Rectangle(6,4));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round+"is a better deal than"+rect+":"+pd.betterDeal(round,rect));
    }
    public static void main(String[] args){
        new PizzaClient().run();
    }
}
