package onlineShop;

public class Cap extends Product {
    private Visor visor;

    public Cap(String barCode, String desc, Color color, Visor visor) {
        super(barCode, desc, color);
        this.visor = visor;
        this.price = price();
    }

    @Override
    public float price() {
        return visor == Visor.FLAT ? Product.VISOR_FLAT : Product.VISOR_CURVED;
    }

    @Override
    public String toString() {
        return "Cap{" +
               "visor=" + visor +
               "} " + super.toString();
    }
}
