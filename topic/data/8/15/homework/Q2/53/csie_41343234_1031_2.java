import java.util.Scanner;

public class CSIE_41343242_1031_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int ary[] = new int[sc.nextInt()];
        for(int i=0;i<ary.length;i++) ary[i] = sc.nextInt();
        sc.close();

        for(int i=0;i<ary.length-1;i++)
        {
            int max = i + 1;
            for(int j=i+2;j<ary.length;j++) max = (ary[max] < ary[j] ? j : max);
            if(max != i) ary[i] = ary[max];
        }
        ary[ary.length - 1] = - 1;

        for(int i=0;i<ary.length;i++) System.out.print(ary[i] + (i == ary.length - 1 ? "" : " "));
    }
}