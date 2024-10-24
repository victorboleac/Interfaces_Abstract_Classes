package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }


    public void checkVehicles() {
        for(T element : traffic){
            if(element instanceof Vehicle){
                ((Vehicle) element).move();
            }
        }
    }
}