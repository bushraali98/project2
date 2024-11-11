public class Car {

    private String code;
    private Route fixedRoute;
    private int maximum_capacity;

    public Car(String code, Route fixedRoute, int maximum_capacity) {
        this.code = code;
        this.fixedRoute = fixedRoute;
        this.maximum_capacity = maximum_capacity;
    }

    public String getCode() {
        return code;
    }

    public Route getFixedRoute() {
        return fixedRoute;
    }

    public int getMaximumCapacity() {
        return maximum_capacity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFixedRoute(Route fixedRoute) {
        this.fixedRoute = fixedRoute;
    }

    public void setMaximumCapacity(int maximum_capacity) {
        this.maximum_capacity = maximum_capacity;
    }
}
