public class reverse_aString_II {

    public static void reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);

        }
    }

    public static void main(String[] args) {
        System.out.println("Test");

        String str = "This is the test string!";
        reverse(str);

    }
}