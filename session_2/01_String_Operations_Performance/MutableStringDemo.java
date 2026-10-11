public class MutableStringDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 3);
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Thread-safe");
        sbf.append(" text");
        System.out.println("StringBuffer: " + sbf);
    }
}
