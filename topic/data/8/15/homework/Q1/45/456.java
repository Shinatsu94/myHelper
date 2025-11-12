import java.util.Scanner;

public class SelectionSortExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 讀入陣列長度
        System.out.print("請輸入陣列長度：");
        int n = input.nextInt();

        int[] arr = new int[n];

        // 逐一輸入陣列內容
        for (int i = 0; i < n; i++) {
            System.out.print("請輸入第 " + (i + 1) + " 個元素：");
            arr[i] = input.nextInt();
        }
	
        // 輸出排序前的陣列
        System.out.print("排序前的陣列：");
        printArray(arr);

	/*int sizea= arr.length;
	arr[sizea]=-1;*/

        //  排序
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
		if(arr[i]<arr[j]){
		arr[i]=arr[j];
		}



		}
        }

        // 輸出排序後的陣列
        System.out.print("排序後的陣列：");
        printArray(arr);

        input.close();
    }

    // 輔助方法：列印陣列
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
System.out.print(-1);
        System.out.println("]");
    }
}
