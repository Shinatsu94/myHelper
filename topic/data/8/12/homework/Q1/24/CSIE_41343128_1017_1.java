public class CSIE_41343128_1017_1 {
    public static void main(String[] args) {
        // (a) 計算 i = 10000 到 100000 每10000項的 pi 值
        for (int i = 10000; i <= 100000; i += 10000) {
            double pi = 0.0;
            boolean flag = true;
            for (int a = 1; a <= i; a++) {
                double term = 1.0 / (2 * a - 1);
                if (flag) pi += term;
                else pi -= term;
                flag = !flag;
            }
            pi *= 4;
            System.out.printf("i = %6d, pi = %.10f\n", i, pi);
        }

        System.out.println();

        // (b) 找出最小 i 使 pi >= 3.14159
         int counti = 1;
        double pi2 = 0.0;
        boolean flag2 = true;
        double pi_val = 0.0;

        while (true) {
            double term = 1.0 / (2 * counti - 1);
            if (flag2) pi2 += term;
            else pi2 -= term;
            flag2 = !flag2;

            pi_val = 4 * pi2;

            //  四捨五入到第5位為 3.14159           
	 if (pi_val >= 3.141585 && pi_val < 3.141595) {
                System.out.printf("i = %d", counti);
                break;
            }

            counti++;
        }
    }
}

/*
2025/10/17
作者: 陳廷鑫
最後編輯時間: 11:51
功能: π值，找出最小項數使π值
*/
