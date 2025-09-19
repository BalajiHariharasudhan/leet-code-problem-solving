/*Problem:Zero Segregation*/
public class ZeroSegregationStable {
    public static void moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int write = 0; // position to write next non-zero
        for (int read = 0; read < arr.length; read++) {
            if (arr[read] != 0) {
                arr[write++] = arr[read];
            }
        }
        // fill remaining positions with zeros
        while (write < arr.length) {
            arr[write++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12, 0, 5};
        System.out.println("Before:");
        printArray(a);
        moveZerosToEnd(a);
        System.out.println("After:");
        printArray(a);
    }

    private static void printArray(int[] arr) {
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
}
