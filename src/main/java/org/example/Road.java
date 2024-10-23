package org.example;

public class Road extends Environment<Drivable>{
    @Override
    public void checkTraffic() {
        super.traffic.forEach(Drivable::drive);
    }
}
