import java.util.*;

public class FlashSale {

    private HashMap<String, Integer> stock = new HashMap<>();

    public FlashSale() {
        stock.put("P100", 5);
    }

    public void purchase(String productId) {
        int available = stock.getOrDefault(productId, 0);

        if (available > 0) {
            stock.put(productId, available - 1);
            System.out.println("Purchase successful. Remaining: " + (available - 1));
        } else {
            System.out.println("Out of stock!");
        }
    }

    public static void main(String[] args) {
        FlashSale fs = new FlashSale();
        fs.purchase("P100");
        fs.purchase("P100");
    }
}