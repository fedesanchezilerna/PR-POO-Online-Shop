package onlineShop;

public class Cap extends Product {
    private Visor visor;

    public Cap(String barCode, String desc, Color color, Visor visor) {
        super(barCode, desc, color);
        this.visor = visor;
        this.price = price();
    }

    public Visor getVisor() {
        return visor;
    }

    public void setVisor(Visor visor) {
        this.visor = visor;
    }

    @Override
    public float price() {
        return visor == Visor.FLAT ? Product.VISOR_FLAT : Product.VISOR_CURVED;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s%10s%10s %-10s", "", "", "", visor.name());
    }
}
