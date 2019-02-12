public abstract class Stalls implements IReviewed {

   private String name;
   private String ownerName;
   private int parkingSpot;
   private int rating;

   public Stalls(String name, String ownerName, int parkingSpot, int rating){
       this.name = name;
       this.ownerName = ownerName;
       this.parkingSpot = parkingSpot;
       this.rating = rating;
   }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getParkingSpot() {
        return this.parkingSpot;
    }

    public int getRating() {
        return this.rating;
    }
}
