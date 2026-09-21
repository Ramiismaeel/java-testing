public class TddBonus {
    static void main() {
    }

    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i<= n; i++) {
            result *=i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if(n==0 || n== 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int fibonacci2(int n) {
        if(n==0 || n== 1) return n;
        int previuos = 0;
        int current = 1;

        for(int i = 2; i<=n; i++) {
           int next = current + previuos;
           previuos = current;
           current = next;
        }
        return current;
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for(int i = 0; i< arr1.length; i++) {
            result[i] = arr1[i];
        }
        for(int i = 0; i< arr2.length; i++) {
            result[i+ arr1.length] = arr2[i];
        }
        return result;
    }
}
