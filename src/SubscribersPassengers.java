public class SubscribersPassengers extends Passenger{

    private double discount = 0.5;

    public SubscribersPassengers(String name, String ID, Car reservedCar) {
        super(name, ID, reservedCar);
    }


    @Override
    public double reserveCar(Car car) throws Exception{
        if (car.getMaximumCapacity() == 0) {
          throw new Exception("There is no capacity inside the car!");
        }
        this.setReservedCar(car);
        return this.setTripCost(car.getFixedRoute().getTripPrice() * this.discount);
    }

    @Override
    public String displyInformation() {
        return ("Passenger information:\nName: " + this.getName() +
                "\nReserved car code: " + this.getReservedCar().getCode() +
                "\nTrip Cost: " + this.getTripCost() +
                "\nRoute price: " + this.getReservedCar().getFixedRoute().getTripPrice());
    }


}
