import java.util.Scanner;
public class CSIE_41343101_1031_2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int arrSize=sc.nextInt();
          int arr[];
          arr=new int[arrSize];
          for (int i = 0; i < arrSize;i++) {
            arr[i]=sc.nextInt();
          }
          for (int i = 0; i < arrSize-1;i++) {
             int max=arr[i+1];
             for (int j = i+1; j < arrSize;j++) {
                 if(arr[j]>max){
                     max=arr[j];
                 }
                 arr[i]=max;
             }
          }
        arr[arrSize-1]=-1;
        for (int i = 0; i < arrSize-1;i++) {
            System.out.printf(arr[i]+" ");
        }
        System.out.print(arr[arrSize-1]);
    }
}
