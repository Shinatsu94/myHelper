import java.util.*;

public class csie_41343137_1031_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                 
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {         
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);                  
        
                for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");  
        }
        System.out.println();  
    }

    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int oin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[oin]) oin = j;   
            }
            int s = a[i]; 
            a[i] = a[oin]; 
            a[oin] = s;                       
        }
    }
}
