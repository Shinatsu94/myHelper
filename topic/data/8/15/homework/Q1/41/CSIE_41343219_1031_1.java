import java.util.Scanner;

public class CSIE_41343219_1031_1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int ary[] = new int[sc.nextInt()];
        for(int i=0;i<ary.length;i++) ary[i] = sc.nextInt();
        sc.close();
        
        for(int i=0;i<ary.length;i++)
        {
            int min = i;
            for(int j=i+1;j<ary.length;j++) min = (ary[min] > ary[j] ? j : min);
            if(min != i)
            {
                int tmp = ary[i];
                ary[i] = ary[min];
                ary[min] = tmp;
            }
        }

        for(int i=0;i<ary.length;i++) System.out.print(ary[i] + (i == ary.length - 1 ? "" : " "));
    } 
}