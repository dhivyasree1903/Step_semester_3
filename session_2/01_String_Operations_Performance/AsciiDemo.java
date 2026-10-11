public class AsciiDemo {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println("ASCII of 'A': " + (int) letter);
        System.out.println("Character for 97: " + (char) 97);
        char upper = 'M';
        System.out.println("Lowercase using +32: " + (char) (upper + 32));
        System.out.println("Character.isDigit('7'): " + Character.isDigit('7'));
        System.out.println("Character.isLetter('Z'): " + Character.isLetter('Z'));
    }
}
