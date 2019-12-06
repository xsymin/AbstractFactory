package abstractFactory;

public class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("Run fast!");
    }

    @Override
    public void start() {
        System.out.println("Start fast!");
    }
}
