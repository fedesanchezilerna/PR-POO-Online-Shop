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
        float total = Product.PRICE_BASICT + fabric.getPrice();
        if (hasPocket) total += Product.PRICE_POCKET;
        if (hasButtons) total += Product.PRICE_BUTTONS;
        if (printImage != null) total += Product.PRICE_IMAGE;
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-10s %-10s", hasPocket, hasButtons);
    }
}