import java.util.*;
import java.io.*;

public class  CSIE_41343223_1031_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // 確保小數點為 '.'
        Scanner sc = new Scanner(System.in);

        // 讀入 3x3 矩陣（9 個數）
        double a, b, c, d, e, f, g, h, i;
        if (! (sc.hasNextDouble())) { errInput(); return; } a = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } b = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } c = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } d = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } e = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } f = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } g = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } h = sc.nextDouble();
        if (! (sc.hasNextDouble())) { errInput(); return; } i = sc.nextDouble();

        // 1) 行列式（Sarrus 法則）
        double det = a*(e*i - h*f) - b*(d*i - g*f) + c*(d*h - e*g);

        final double EPS = 1e-9;
        if (Math.abs(det) < EPS) {
            System.out.printf("此矩陣的行列式約為 0（det ≈ %.12f），不可逆。\n", det);
            return;
        }

        // 2) 代數餘子式 C_rs
        double C11 =  (e*i - h*f);
        double C12 = -(d*i - g*f);
        double C13 =  (d*h - e*g);

        double C21 = -(b*i - c*h);
        double C22 =  (a*i - c*g);
        double C23 = -(a*h - b*g);

        double C31 =  (b*f - c*e);
        double C32 = -(a*f - c*d);
        double C33 =  (a*e - b*d);

        // 3) adj(A) = C^T，並計算 A^{-1} = (1/det) * adj(A)
        double[][] inv = new double[3][3];
        inv[0][0] = C11 / det;  inv[0][1] = C21 / det;  inv[0][2] = C31 / det;
        inv[1][0] = C12 / det;  inv[1][1] = C22 / det;  inv[1][2] = C32 / det;
        inv[2][0] = C13 / det;  inv[2][1] = C23 / det;  inv[2][2] = C33 / det;

        // 輸出結果
        System.out.printf("行列式 det(A) = %.6f%n", det);
        System.out.println("A 的反矩陣 A^{-1}：");
        for (int r = 0; r < 3; r++) {
            for (int ccol = 0; ccol < 3; ccol++) {
                System.out.printf("%12.6f", inv[r][ccol]);
            }
            System.out.println();
        }
    }

    private static void errInput() {
        System.err.println("輸入格式錯誤：請依序輸入 9 個數字（3x3）。");
    }
}
