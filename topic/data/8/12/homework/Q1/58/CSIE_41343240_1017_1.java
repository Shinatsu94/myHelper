//date: 2025/10/17
//function: 計算 π 的近似值，並找出最小的項數 i，使 π 的值在小數點第 5 位精確到 3.14159。
//name&number: 黃榮裕41343240

public class CSIE_41343240_1017_1 {
    public static void main(String[] args) {
        // (a) i = 10000, 20000, ..., 100000
        int[] arr = { 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000 };
        for (int i : arr) {
            double pi = 0.0;
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    pi += 1.0 / (2 * j - 1);
                } else {
                    pi -= 1.0 / (2 * j - 1);
                }
            }
            pi *= 4;
            System.out.printf("i = %6d, pi = %.10f\n", i, pi);
        }

        // (b) 找到最小 i 使 pi = 3.14159 (小數點第5位)
        double pi = 0.0;
        int i = 1;
        while (true) {
            if (i % 2 == 1) {
                pi += 1.0 / (2 * i - 1);
            } else {
                pi -= 1.0 / (2 * i - 1);
            }
            double piValue = pi * 4;
            if ((int) (piValue * 100000) == 314159) { // 取到小數點第5位比對
                System.out.printf("\ni = %d\n", i);
                break;
            }
            i++;
        }
    }
}
