public class Rollercoaster extends  Attraction implements ISecurity, ITicketed {

    public Rollercoaster(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getHeight() < 1.2 || visitor.getAge() < 12){
            return true;
        }
        return false;
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() > 1.0){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
