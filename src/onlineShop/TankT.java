package onlineShop;

public class TankT extends TShirt {
    public TankT(String barCode, String desc, Color color, Fabric fabric) {
        super(barCode, desc, color, fabric);
        this.price = price();
    }

    @Override
    public float price() {
        return Product.PRICE_TANKT + fabric.getPrice();
    }
}
