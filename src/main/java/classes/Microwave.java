package classes;

import interfaces.Divice;

/**
 * Created by Yevgeni on 05.02.2016.
 */
public class Microwave implements Divice {
    private String on = null;
    private String off = null;

    public Microwave() {
        turnOff();
        turnOn();
    }


    public void turnOn() {
        on = this.getClass().getName() + ": I'm turned On";
    }

    public String getOn() {
        return on;
    }

    public String getOff() {
        return off;
    }

    public void turnOff() {
        off = this.getClass().getName() + ": I'm turned Off";
    }
}
