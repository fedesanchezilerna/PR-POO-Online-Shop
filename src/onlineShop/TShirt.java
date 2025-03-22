package onlineShop;

public abstract class TShirt extends Product{
    protected Fabric fabric;

    public TShirt(String barCode, String desc, Color color, Fabric fabric) {
        super(barCode, desc, color);
        this.fabric = fabric;
        this.price = price();
    }

    @Override
    public float price() {
        if (this.printImage != null) return fabric.getPrice() + PRICE_IMAGE;
        return fabric.getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
