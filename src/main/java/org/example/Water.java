package org.example;

public class Water extends Environment<Swimmable> {
    @Override
    public void checkTraffic() {
        super.traffic.forEach(Swimmable::swim);
    }
}
