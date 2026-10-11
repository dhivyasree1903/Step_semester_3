public class Cart {

    private final String cartId;
    private final double[] prices;
    private int itemCount;

    // Constructor fixes cart ID and maximum capacity
    public Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        if (maxItems <= 0) {
            this.prices = new double[10];
        } else {
            this.prices = new double[maxItems];
        }
        this.itemCount = 0;
    }

    public String getCartId() {
        return cartId;
    }

    // Add an item's price to the cart
    public void addItem(double price) {
        if (price < 0) {
            System.out.println("Invalid price. Item cannot have negative cost.");
            return;
        }

        if (itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Compute total sum on request without exposing the underlying prices array
    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }
        return total;
    }

    // Read-only count of items added
    public int getItemCount() {
        return itemCount;
    }

    public static void main(String[] args) {
        System.out.println("--- Shopping Cart Demo ---");
        Cart cart = new Cart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.printf("cart.getTotal() -> %.0f\n", cart.getTotal());
        System.out.println("cart.getItemCount() -> " + cart.getItemCount());
    }
}
