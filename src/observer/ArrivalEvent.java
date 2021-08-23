package observer;

import java.util.Date;

public class ArrivalEvent {
    private final Date arrivalTime;

    public ArrivalEvent(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }
}
