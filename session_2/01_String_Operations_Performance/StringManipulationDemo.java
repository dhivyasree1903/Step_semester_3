public class StringManipulationDemo {
    public static void main(String[] args) {
        System.out.println("trim(): [" + "   Hello Java   ".trim() + "]");
        System.out.println("replace(): " + "I like cats".replace("cats", "dogs"));
        String[] parts = "Ravi,25,Chennai".split(",");
        for (String part : parts) System.out.println(" - " + part);
        System.out.println("concat(): " + "Hello".concat(" World"));
        System.out.println("String.join(): " + String.join("-", "2026", "07", "30"));
    }
}
