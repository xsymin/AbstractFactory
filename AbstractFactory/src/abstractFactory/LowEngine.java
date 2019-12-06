package abstractFactory;

public class LowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("Run slow!");
    }

    @Override
    public void start() {
        System.out.println("Start slow!");
    }
}
