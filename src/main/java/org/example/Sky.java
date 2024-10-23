package org.example;

import java.util.ArrayList;

public class Sky extends Environment<Flyable>{
    @Override
    public void checkTraffic() {
       /* for(Flyable fly: traffic){
            fly.fly();
        }*/

      super.traffic.forEach(Flyable::fly);

    }
}
