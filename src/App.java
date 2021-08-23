import observer.BirthDayEvent;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            BirthDayEvent.makeEvent();
        }
        catch(Exception e){
            System.out.println("Erro: " + e);
        }
    }
}
