public class NonSubscribersPassengers extends Passenger{
    private boolean discount_coupon;
    private double discount = 0.1;

    public NonSubscribersPassengers(String name, String ID, Car reservedCar, boolean discount_coupon) {
        super(name, ID, reservedCar);
        this.discount_coupon = discount_coupon;
    }

    @Override
    public double reserveCar(Car car) throws Exception{
        if (car.getMaximumCapacity() == 0) {
            throw new Exception("There is no capacity inside the car!");
        }

        this.setReservedCar(car);

        if (this.discount_coupon) {
            return this.setTripCost(car.getFixedRoute().getTripPrice() * (1 - this.discount));
        } else {
            return this.setTripCost(car.getFixedRoute().getTripPrice());
        }
    }

    @Override
    public String displyInformation() {
        return ("Passenger information:\nName: " + this.getName() +
                "\nReserved car code: " + this.getReservedCar().getCode() +
                "\nTrip Cost: " + this.getTripCost() +
                "\nRoute price: " + this.getReservedCar().getFixedRoute().getTripPrice());
    }


}
