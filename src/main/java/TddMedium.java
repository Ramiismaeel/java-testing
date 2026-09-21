public class TddMedium {
    static void main() {
    }

    public static String reverseString(String text)  {
        if(text == null || text.isEmpty()) {
            return null;
        } else {
            return new StringBuilder(text).reverse().toString();
        }
    }

    public static boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString().toLowerCase();
        return text.toLowerCase().equals(reversedText);
    }

    public static int countVowels(String text) {
        char[] vowels = {'a' , 'e', 'i','o','u' };
        int count = 0;
        for(char c: vowels) {
            if(text.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }


}
