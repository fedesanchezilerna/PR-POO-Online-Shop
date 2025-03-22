package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private List<Product> stock;

    public OnlineShop() {
        this.stock = new ArrayList<>();
    }

    public List<Product> getStock() {
        return stock;
    }

    public void setStock(List<Product> stock) {
        this.stock = stock;
    }

    public boolean addProduct(Product p) {
        return stock.add(p);
    }

    public boolean removeProduct(Product p) {
        return stock.remove(p);
    }

    /**
     * If onSell is true:
     * Adds a print to the specified product.
     * Add the cost of printing to the product price.
     * Remove the product from stock.
     *
     * @param p product to sell
     * @param printImage image to print
     * @return true if the product could be removed from stock, false otherwise.
     */
    public boolean sellProduct(Product p, PrintImage printImage) {
        if (p.onSell) {
            p.setPrintImage(printImage);
            return removeProduct(p);
        }
        return false;
    }

    /**
     *
     * @return the total value of the stock
     */
    public float stockValue() {
        return (float) stock.stream().mapToDouble(Product::price).sum();
    }

    /**
     *
     * @return the content of the stock in text format
     */
    public String listStock() {
        StringBuilder sb = new StringBuilder();
        sb.append("BARCODE   DESC      PRICE     PRINT     COLOR     ON-SELL   FABRIC    POCKET?   BUTTONS?  CAP TYPE  \n");
        sb.append("----------------------------------------------------------------------------------------------------\n");
        for (Product product : stock) {
            sb.append(product.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     *
     * @return the number of caps in stock
     */
    public int numCaps() {
        return (int) stock.stream().filter(product -> product instanceof Cap).count();
    }

    /**
     *
     * @return the number of TShirts in stock
     */
    public int numTShirts() {
        return (int) stock.stream().filter(product -> product instanceof TShirt).count();
    }
}
