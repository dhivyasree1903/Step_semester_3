public class StringMethodsDemo {
    public static void main(String[] args) {
        String city = "Chennai";
        System.out.println("length(): " + city.length());
        System.out.println("charAt(0): " + city.charAt(0));
        System.out.println("substring(3): " + city.substring(3));
        System.out.println("substring(1, 5): " + city.substring(1, 5));
        System.out.println("indexOf('n'): " + city.indexOf('n'));
        System.out.println("contains(\"hen\"): " + city.contains("hen"));
        System.out.println("toUpperCase(): " + city.toUpperCase());
        System.out.println("equalsIgnoreCase(\"CHENNAI\"): " + city.equalsIgnoreCase("CHENNAI"));
    }
}
