import java.util.Scanner;

public class csie_41343239_1031_2
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("請輸入陣列長度: ");
        int length = sc.nextInt();

        int[] a = new int[length];

        //System.out.print("請輸入陣列的值: ");
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                a[i] = -1;  
            } else {
                int max = a[i + 1];
                for (int j = i + 1; j < length; j++) {
                    if (a[j] > max) {
                        max = a[j];
                    }
                }
                a[i] = max;
            }
        }

        //System.out.print("置換後的陣列: ");
       for(int i=0;i<length;i++)
   {
    System.out.print(a[i]);
    if(i<(length-1)) System.out.print(" ");
   }


        sc.close();
    }
}
