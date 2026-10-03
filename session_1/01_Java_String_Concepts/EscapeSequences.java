public class EscapeSequences {
    public static void main(String[] args) {
        // Common escape sequences
        String newline = "Line 1\nLine 2";
        String tab = "Column1\tColumn2";
        String quote = "He said \"Hello\"";
        String backslash = "Path: C:\\Users\\Java";
        String carriageReturn = "First\rSecond";
        String backspace = "Hello\bWorld";
        String formFeed = "Page1\fPage2";

        // Unicode escape - must be exactly 4 hex digits
        String unicode = "\u0048\u0065\u006C\u006C\u006F"; // "Hello"

        // Octal escape (legacy)
        String octal = "\110\145\154\154\157"; // "Hello"

        System.out.println("Newline:\n" + newline);
        System.out.println("Tab:\n" + tab);
        System.out.println("Quote: " + quote);
        System.out.println("Backslash: " + backslash);
        System.out.println("Carriage Return: " + carriageReturn);
        System.out.println("Backspace: " + backspace);
        System.out.println("Form Feed: " + formFeed);
        System.out.println("Unicode: " + unicode);
        System.out.println("Octal: " + octal);

        // Platform-specific line separator
        String platformNewline = System.lineSeparator();
        System.out.println("Platform Line Separator length: " + platformNewline.length());

        // Platform file separator
        String platformPath = "folder" + System.getProperty("file.separator") + "file.txt";
        System.out.println("Platform Path: " + platformPath);
    }
}
