package abstractFactory;

public interface CarFactory {
    public Engine createEngine();
    public Seat createSeat();
    public Tyre createTyre();
}
