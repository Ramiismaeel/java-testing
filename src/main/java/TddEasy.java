public class TddEasy {
    static void main() {
        System.out.println(getFirstChar("Hello"));
    }

    public static int sum(int a, int b) {
        return a+b;
    }
    public static boolean isEven(int num) {
        return num % 2==0;
    }

    public static Character getFirstChar(String text) {
        if(text == null || text.isEmpty()) {
            return null;
        } else {
            return text.charAt(0);
        }
    }
}
