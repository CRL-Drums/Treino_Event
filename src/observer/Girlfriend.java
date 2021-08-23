package observer;

public class Girlfriend implements ArrivalObserver{

    @Override
    public void arrived(ArrivalEvent event) {
        System.out.println("Turn off the lights");
        System.out.println("Make silence");
        System.out.println("Surprise *****!!");
    }
}
