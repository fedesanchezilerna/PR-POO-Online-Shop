package onlineShop;

public class LongT extends TShirt {
    private boolean hasPocket;

    public LongT(String barCode, String desc, Color color, Fabric fabric, boolean hasPocket) {
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
        return Product.PRICE_LONGT + (hasPocket ? Product.PRICE_POCKET : 0) + fabric.getPrice();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-10s", hasPocket);
    }
}
