import java.util.Scanner;
public class CSIE_41343150_1003_2{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("輸入 A: ");
 int A = scanner.nextInt();
System.out.print("輸入 B: ");
 int B = scanner.nextInt();
System.out.print("輸入 C: ");
 int C = scanner.nextInt();
 int max = (A > B) 
            ? (A > C ? A : C) 
            : (B > C ? B : C);
  int min = (A < B) 
                    ? (A < C ? A : C) 
                    : (B < C ? B : C);
int mid = A + B + C - max - min;
  System.out.println("最大值 max = " + max);
        System.out.println("最小值 min = " + min);
        System.out.println("中間值 mid = " + mid);

        scanner.close();
}
}