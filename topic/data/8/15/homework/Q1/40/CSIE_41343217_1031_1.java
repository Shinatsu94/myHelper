import java.util.Scanner;

public class CSIE_41343217_1031_1 {

    public static void main(String[] args) {
        // 建立 Scanner 物件，用於讀取使用者輸入
        Scanner sc = new Scanner(System.in);
        
        // 讀取接下來要輸入的整數數量 n
        int n = sc.nextInt();
        
        // 宣告並初始化兩個大小為 n 的整數陣列
        int[] a = new int[n];
        // 雖然在這個程式中沒有使用到，但它被宣告用於儲存原始輸入
        int[] original = new int[n]; 

        // 迴圈讀取 n 個整數，並將它們存入陣列 a 和 original
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            original[i] = a[i]; // 將輸入值同時儲存到 original 陣列
        }

        // 呼叫 selectionSort 方法對陣列 a 進行排序
        selectionSort(a);

        // 呼叫 printArray 方法印出排序後的陣列 a
        printArray(a);

        // 關閉 Scanner 物件，釋放資源
        sc.close();
    }

    // 選擇排序 (Selection Sort) 的實作方法
    public static void selectionSort(int[] a) {
        // 取得陣列的長度
        int n = a.length;
        
        // 外層迴圈：遍歷所有未排序的元素 (從第一個到倒數第二個)
        for (int i = 0; i < n - 1; i++) {
            // 假設當前位置 i 就是最小元素的索引
            int minIdx = i;
            
            // 內層迴圈：從 i+1 的位置開始，尋找未排序部分中最小元素的索引
            for (int j = i + 1; j < n; j++) {
                // 如果找到比當前最小元素 a[minIdx] 更小的元素 a[j]
                if (a[j] < a[minIdx]) {
                    // 更新最小元素的索引為 j
                    minIdx = j;
                }
            }
            
            // 執行交換：將找到的最小元素 (a[minIdx]) 放到當前位置 (a[i])
            // 步驟 1: 將最小元素的值暫存起來
            int temp = a[minIdx];
            // 步驟 2: 將當前位置 a[i] 的值移到原最小元素的位置 a[minIdx]
            a[minIdx] = a[i];
            // 步驟 3: 將暫存的最小元素值移到當前位置 a[i]
            a[i] = temp;
        }
    }

    // 印出陣列內容的方法，元素之間以空格隔開
    public static void printArray(int[] a) {
        // 迴圈遍歷陣列的所有元素
        for (int i = 0; i < a.length; i++) {
            // 印出當前元素
            System.out.print(a[i]);
            
            // 如果不是陣列中的最後一個元素，則印出一個空格
            if (i < a.length - 1) {
                System.out.print(" ");
            }
        }
        // 印出一個換行符號，結束這一行的輸出
        System.out.println();
    }
}