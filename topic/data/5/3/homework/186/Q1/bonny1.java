import java.util.Scanner;

public class bonny1
{
  public static void main(String args[])
  {
     Scanner scn =new Scanner(System.in);
    

     int n = scn.nextInt();
     int[] arr = new int[n];
       
     for (int i = 0; i < n; i++){
         arr[i] = scn.nextInt();
     }

     int max = arr[0], min = arr[0], sum = arr[0];
     for (int i = 1; i < n; i++){
         if (arr[i] > max) max = arr[i];
         if (arr[i] < min) min = arr[i];
         sum += arr[i];
     }
     double avg = (double)sum / n;

     System.out.printf("%d\n%d\n%.2f\n", max, min, avg);
   }
}