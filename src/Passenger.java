public abstract class  Passenger {
    private String name;
    private String ID;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String ID, Car reservedCar) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public double getTripCost() {
        return this.tripCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double setTripCost(double tripCost) {
        this.tripCost = tripCost;
        return tripCost;
    }

    public abstract double reserveCar(Car car) throws Exception;
    public abstract String displyInformation();


}
