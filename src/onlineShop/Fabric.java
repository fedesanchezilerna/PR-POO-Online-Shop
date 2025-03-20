package onlineShop;

public enum Fabric {
    COTTON(1),
    LINEN(2),
    POLYESTER(3),
    DISTRICT(4),
    LYCRA(5);

    private final int extraCost;

    Fabric(int extraCost) {
        this.extraCost = extraCost;
    }

    public int getExtraCost() {
        return extraCost;
    }
}
