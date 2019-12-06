package abstractFactory;

public interface Seat  {
    public void message();
}

class LuxurySeat implements Seat{
    @Override
    public void message() {
        System.out.println("Very comfortable!");
    }
}

class LowSeat implements Seat{
    @Override
    public void message() {
        System.out.println("Very uncomfortable!");
    }
}
