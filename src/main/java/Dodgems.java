public class Dodgems extends Attraction implements  ITicketed {

    public Dodgems(String name){
        super(name);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge() < 12){
            return defaultPrice() / 2;
        }
        return defaultPrice();
    }

}
