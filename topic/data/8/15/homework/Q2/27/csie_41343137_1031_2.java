import java.util.*;

public class csie_41343137_1031_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); 
        int[] arr = new int[n];

       	for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

                Arrays.sort(arr);

               int Rmax = -1;
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = Rmax;
            if (temp > Rmax) Rmax = temp;
        }

               for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}
