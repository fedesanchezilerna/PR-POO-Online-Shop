package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop();

        onlineShop.addProduct(new BasicT("1001", "BASIC1", Color.WHITE, Fabric.COTTON, false, false));
        onlineShop.addProduct(new BasicT("1002", "BASIC2", Color.BLACK, Fabric.LINEN, true, true));
        onlineShop.addProduct(new BasicT("1003", "BASIC3", Color.BLACK, Fabric.POLYESTER, true, true));
        onlineShop.addProduct(new VNeckT("2001", "VNECK1", Color.RED, Fabric.LYCRA, false));
        onlineShop.addProduct(new VNeckT("2002", "VNECK2", Color.RED, Fabric.LYCRA, true));
        onlineShop.addProduct(new LongT("3001", "LONG1", Color.RED, Fabric.POLYESTER, false));
        onlineShop.addProduct(new LongT("3002", "LONG2", Color.YELLOW, Fabric.LYCRA, true));
        onlineShop.addProduct(new TankT("4001", "TANK1", Color.RED, Fabric.DISTRICT));
        onlineShop.addProduct(new TankT("4002", "TANK2", Color.YELLOW, Fabric.LYCRA));
        onlineShop.addProduct(new Cap("5001", "CAP1", Color.WHITE, Visor.FLAT));
        onlineShop.addProduct(new Cap("5002", "CAP2", Color.YELLOW, Visor.CURVED));

        // Print the stock, total value, number of t-shirts and caps.
        System.out.println(onlineShop.listStock());
        System.out.println("Stock value:    " + onlineShop.stockValue());
        System.out.println("Num of TShirts: " + onlineShop.numTShirts());
        System.out.println("Num of Caps:    " + onlineShop.numCaps() + "\n");

        List<Product> onlineShopStock = new ArrayList<>(onlineShop.getStock());

        // Selling a BasicT t-shirt with the BULL print. Check that the price has changed.
        for (Product product : onlineShopStock) {
            if (product instanceof BasicT) {
                System.out.println("Original price: " + product.getPrice());
                onlineShop.sellProduct(product, PrintImage.BULL);
                System.out.println("New price:      " + product.getPrice());
                break;
            }
        }
        System.out.println("Stock value:    " + onlineShop.stockValue() + "\n");

        // Selling a VNeckT type T-shirt with the TIGER print. Check that the price has changed.
        sellingByType(onlineShop, VNeckT.class, PrintImage.TIGER);

        // Selling a LongT-shirt with the COBRA print. Check that the price has changed.
        sellingByType(onlineShop, LongT.class, PrintImage.COBRA);

        // Selling a TankT t-shirt with the REINDEER print. Check that the price has changed.
        sellingByType(onlineShop, TShirt.class, PrintImage.REINDEER);

        // Selling a cap with the EAGLE print. Check that the price has changed.
        sellingByType(onlineShop, Cap.class, PrintImage.EAGLE);

        // Print the stock, total value, number of t-shirts and caps again and check that all products sold are out of stock.
        System.out.println(onlineShop.listStock());
        System.out.println("Stock value:    " + onlineShop.stockValue());
        System.out.println("Num of TShirts: " + onlineShop.numTShirts());
        System.out.println("Num of Caps:    " + onlineShop.numCaps() + "\n");
    }

    /**
     * Sells the first product of the specified type from the online shop stock,
     * applying the given print image. It prints the original and new price, and
     * whether the sale was successful. Finally, print stock value updated.
     *
     * @param onlineShop  the OnlineShop instance
     * @param productType the class type of the product to sell (e.g., BasicT.class, VNeckT.class)
     * @param printImage  the print to apply to the product
     */
    private static void sellingByType(OnlineShop onlineShop, Class<?> productType, PrintImage printImage) {
        for (Product product : new ArrayList<>(onlineShop.getStock())) {
            if (productType.isInstance(product)) {
                System.out.println("Original price: " + product.getPrice());
                onlineShop.sellProduct(product, printImage);
                System.out.println("New price:      " + product.getPrice());
                break;
            }
        }
        System.out.println("Stock value:    " + onlineShop.stockValue() + "\n");
    }
}
