import java.util.Scanner;
public class CSIE_41343101_1031_1 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int arrSize=sc.nextInt();
          int arr[];
          arr=new int[arrSize];
          for (int i = 0; i < arrSize;i++) {
            arr[i]=sc.nextInt();
          }
          for (int i = 0; i < arrSize;i++) {
             for (int j = i; j < arrSize;j++) {
                 if(arr[i]>arr[j]){
                     int t=arr[i];arr[i]=arr[j];arr[j]=t;
                 }
             }
          }
        for (int i = 0; i < arrSize;i++) {
            System.out.printf(((i!=0)?" ":"")+arr[i]);
        }
    }
}
