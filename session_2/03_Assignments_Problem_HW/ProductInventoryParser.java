/**
 * Problem 3: Product Inventory CSV Parser
 * Scenario: Warehouse team receives inventory updates as CSV lines and formats them.
 */
public class ProductInventoryParser {

    /**
     * Parses and formats a CSV line containing product inventory data.
     * Expected format: "ProductName,SKU,Quantity"
     * @param csvLine The raw CSV record string
     */
    public static void parseInventoryRecord(String csvLine) {
        if (csvLine == null) {
            System.out.println("Invalid Record");
            return;
        }

        String[] fields = csvLine.split(",");

        // Validate that exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String productName = fields[0].trim();
        String sku = fields[1].trim();
        String quantityStr = fields[2].trim();

        // Basic validation on non-empty fields
        if (productName.isEmpty() || sku.isEmpty() || quantityStr.isEmpty()) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", productName, sku, quantityStr);
    }

    public static void main(String[] args) {
        String test1 = "Wireless Mouse,WM-2201,150";
        System.out.println("Test 1: \"" + test1 + "\"");
        parseInventoryRecord(test1);

        String test2 = "Wireless Mouse,150";
        System.out.println("\nTest 2: \"" + test2 + "\"");
        parseInventoryRecord(test2);

        String test3 = "Mechanical Keyboard,KB-9900,45";
        System.out.println("\nTest 3: \"" + test3 + "\"");
        parseInventoryRecord(test3);
    }
}
