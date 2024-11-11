public class Main {
    public static void main(String[] args) {

        Route route = new Route("King Fahad Road", "Tuwaiq Academy", 56);
        Route route1 = new Route("Home", "Boulevard", 67);

        Car car = new Car("3821", route, 3);
        Car car1 = new Car("3451", route1, 0);
        Car car2 = new Car("3452", route, 2);

        SubscribersPassengers passenger1 = new SubscribersPassengers("Ahmed", "12", car);
        NonSubscribersPassengers passenger2 = new NonSubscribersPassengers("Sara", "34", car1, true);
        NonSubscribersPassengers passenger3 = new NonSubscribersPassengers("Lama", "10", car2, true);
        NonSubscribersPassengers passenger4 = new NonSubscribersPassengers("Boshra", "5", car2, false);

        Passenger[] passengers = {passenger1, passenger2, passenger3, passenger4};


        for (Passenger passenger : passengers) {
            try {
                passenger.reserveCar(passenger.getReservedCar());
                System.out.println(passenger.displyInformation());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("-----------------------------");
        }



    }
}