public class TrafficLight {

    private final String id;
    private String color;

    // Constructor fixes ID and initializes state to RED
    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED";
    }

    public String getId() {
        return id;
    }

    // Read-only getter for the current light color
    public String getColor() {
        return color;
    }

    // Transitions to the next state in the fixed cycle: RED -> GREEN -> YELLOW -> RED
    public String next() {
        if ("RED".equals(color)) {
            color = "GREEN";
        } else if ("GREEN".equals(color)) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
        return color;
    }

    public static void main(String[] args) {
        System.out.println("--- Traffic Light State Machine Demo ---");
        TrafficLight t = new TrafficLight("TL-9");

        System.out.println("Initial color: " + t.getColor());
        System.out.println("t.next() -> " + t.next());
        System.out.println("t.next() -> " + t.next());
        System.out.println("t.next() -> " + t.next());
        System.out.println("t.next() -> " + t.next());
    }
}
