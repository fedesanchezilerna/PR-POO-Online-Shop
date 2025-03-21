package onlineShop;

public class VNeckT extends TShirt {
    private boolean hasPocket;

    public VNeckT(String barCode, String desc, Color color, Fabric fabric, boolean hasPocket) {
        super(barCode, desc, color, fabric);
        this.hasPocket = hasPocket;
        this.price = price();
    }

    public boolean isHasPocket() {
        return hasPocket;
    }

    public void setHasPocket(boolean hasPocket) {
        this.hasPocket = hasPocket;
    }

    @Override
    public float price() {
        return Product.PRICE_VNECKT + (hasPocket ? Product.PRICE_POCKET : 0) + fabric.getPrice();
    }

    @Override
    public String toString() {
        return "VNeckT{" +
               "hasPocket=" + hasPocket +
               "} " + super.toString();
    }
}
