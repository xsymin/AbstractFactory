package abstractFactory;

/**
 * 轮胎类
 */
public interface Tyre {
    public void revolve();
}

class LuxuryTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("Not easy to wear!");
    }
}

class LowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("Easy to wear!");
    }
}
