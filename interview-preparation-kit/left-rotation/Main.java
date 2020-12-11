public class Main {

    public static void main(String[] args) {
        // rotLeft(a, d)
    }

    static int[] rotLeft(int[] a, int d) {
        if (a.length == d) {
            return a;
        }
        int[] newArray = new int[a.length];
        int j=0;
        for (int i = d; i < a.length ; i++) {
            newArray[j++] = a[i];
        }
        for (int i = 1; i <= d; i++) {
            newArray[j++] = a[i-1];
        }
        return newArray;
    }

}