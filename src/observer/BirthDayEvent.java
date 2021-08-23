package observer;
public class BirthDayEvent {

    public static void makeEvent(){
        Girlfriend girlfriend = new Girlfriend();
        Doorman doorman = new Doorman();

        doorman.addArrivalObserver(girlfriend);

        doorman.start();
    }
        
}
