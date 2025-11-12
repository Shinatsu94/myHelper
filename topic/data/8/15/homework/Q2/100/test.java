import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 步驟 1: 讀取陣列長度
        //System.out.print("請輸入陣列的長度：");
        int len = sc.nextInt();
        
        int[] nums = new int[len];
        
        // 步驟 2: 讀取陣列元素
        //System.out.println("請輸入 " + length + " 個整數：");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        // 步驟 3: 印出排序前的陣列
        //System.out.println("排序前的陣列：" + Arrays.toString(nums));

        // 步驟 4: 對陣列進行排序
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len ; j++) {
                if (i+1 == len) break;
                if(j == i+1) nums[i] = nums[j];
                if (nums[j] > nums[i]) nums[i] = nums[j];
            }
            if (i+1 == len) nums[i] = -1;
        }

        // 步驟 5: 印出排序後的陣列
        //System.out.println(Arrays.toString(nums));
        for (int i=0; i<len; i++) {
            System.out.print(nums[i]);
            if (i+1 != len) System.out.print(" ");
            else System.out.println();
        }
    }
}