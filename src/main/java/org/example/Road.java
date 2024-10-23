package org.example;

public class Road extends Environment<Vehicle>{
    @Override
    public void checkTraffic() {
        super.traffic.forEach(Vehicle::move);
    }
}
