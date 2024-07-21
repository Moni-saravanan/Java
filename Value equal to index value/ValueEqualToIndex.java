import java.util.Scanner;
class ValueEqualToIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the values equal to index are ");
        for (int i = 0; i < n; i++) {
            if (i == arr[i]) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
}
