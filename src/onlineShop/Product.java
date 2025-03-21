package onlineShop;

public abstract class Product {
    public static final float PRICE_IMAGE = 10;
    public static final float PRICE_BASICT = 10;
    public static final float PRICE_POCKET = 2;
    public static final float PRICE_BUTTONS = 3;
    public static final float PRICE_LONGT = 12;
    public static final float PRICE_VNECKT = 11;
    public static final float PRICE_TANKT = 12;
    public static final float VISOR_FLAT = 20;
    public static final float VISOR_CURVED = 30;

    protected String barCode;
    protected String desc;
    protected float price;
    protected PrintImage printImage;
    protected Color color;
    protected boolean onSell = true;

    public Product(String barCode, String desc, Color color) {
        this.barCode = barCode;
        this.desc = desc;
        this.color = color;
        this.price = 0;
        this.printImage = null;
    }

    public abstract float price();

    public void setPrintImage(PrintImage printImage) {
        this.printImage = printImage;
        this.price += PRICE_IMAGE;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public PrintImage getPrintImage() {
        return printImage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isOnSell() {
        return onSell;
    }

    public void setOnSell(boolean onSell) {
        this.onSell = onSell;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10.2f %-10s %-10s %-10s",
                barCode, desc, price,
                printImage != null ? printImage.name() : "NULL",
                color.name(), onSell);
    }
}
