public class Route {

    private String start_pickup_adress;
    private String destination_adress;
    private double tripPrice;

    public Route(String start_pickup_adress, String destination_adress, double tripPrice) {
        this.start_pickup_adress = start_pickup_adress;
        this.destination_adress = destination_adress;
        this.tripPrice = tripPrice;
    }

    public String getStartPickupAdress() {
        return start_pickup_adress;
    }

    public String getDestination_adress() {
        return destination_adress;
    }

    public double getTripPrice() {
        return this.tripPrice;
    }

    public void setStartPickupAdress(String start_pickup_adress) {
        this.start_pickup_adress = start_pickup_adress;
    }

    public void setDestination_adress(String destination_adress) {
        this.destination_adress = destination_adress;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }
}
