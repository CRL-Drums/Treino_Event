package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
public class Doorman extends Thread{

    private List<ArrivalObserver> observers = new ArrayList<ArrivalObserver>();

    public void addArrivalObserver(ArrivalObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void run(){
        Scanner scannerDoorman = new Scanner(System.in);

        while(true){
            int value = scannerDoorman.nextInt();

            if(value == 1){
                ArrivalEvent event = new ArrivalEvent(new Date());

                for(ArrivalObserver observer: this.observers){
                    observer.arrived(event);
                }
                scannerDoorman.close();
            }
            else{
                System.out.println("Fail");
            }
        }
    }
}
