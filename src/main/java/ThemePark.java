import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stalls> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stalls>();
    }

    public int countAttractions(){
        return this.attractions.size();
    }

    public int countStalls(){
        return this.stalls.size();
    }

    public String visit(Visitor visitor, Attraction attraction){
        return visitor.getName() + " went on " + attraction.getName();

    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStalls(Stalls stalls){
        this.stalls.add(stalls);
    }


}
