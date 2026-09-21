public class MainMedium {

    static void main() {

    }

    public static Character getFirstLetter(String text) {
        if(text == null || text.isEmpty()) {
            return null;
        } else {
            text.contains("a");
            return text.charAt(0);
        }
    }


    public static int divide(int a , int b) {
        if(b ==0 ) {
            throw new IllegalArgumentException("can't be divide by 0");
        }
        return a/b;
    }
}
