package onlineShop;

public class BasicT extends TShirt {
    private boolean hasPocket;
    private boolean hasButtons;

    public BasicT(String barCode, String desc, Color color, Fabric fabric, boolean hasPocket, boolean hasButtons) {
        super(barCode, desc, color, fabric);
        this.hasPocket = hasPocket;
        this.hasButtons = hasButtons;
        this.price = price();
    }

    public boolean isHasPocket() {
        return hasPocket;
    }

    public void setHasPocket(boolean hasPocket) {
        this.hasPocket = hasPocket;
    }

    public boolean isHasButtons() {
        return hasButtons;
    }

    public void setHasButtons(boolean hasButtons) {
        this.hasButtons = hasButtons;
    }

    @Override
    public float price() {
        if (hasPocket) return Product.PRICE_BASICT + Product.PRICE_POCKET + fabric.getPrice();
        if (hasButtons) return Product.PRICE_BASICT + Product.PRICE_BUTTONS + fabric.getPrice();
        return Product.PRICE_BASICT + fabric.getPrice();
    }

    @Override
    public String toString() {
        return "BasicT{" +
               "hasPocket=" + hasPocket +
               ", hasButtons=" + hasButtons +
               "} " + super.toString();
    }
}