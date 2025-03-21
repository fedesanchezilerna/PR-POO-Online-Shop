package onlineShop;

public enum Fabric {
    COTTON(1),
    LINEN(2),
    POLYESTER(3),
    DISTRICT(4),
    LYCRA(5);

    private final int price;

    Fabric(int extraCost) {
        this.price = extraCost;
    }

    public int getPrice() {
        return price;
    }
}
