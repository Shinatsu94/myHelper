public class CSIE_41343236_0926_2{
	public static void main(String[] args) throws Exception{
	int i = 0;

        for (int percent = 0; percent <= 100; percent++) {
            char ch; // 存放旋轉棒子的字元

            // 用 if/else 判斷 i % 4 的結果
            if (i % 4 == 0) {
                ch = '|';
            } else if (i % 4 == 1) {
                ch = '/';
            } else if (i % 4 == 2) {
                ch = '-';
            } else {
                ch = '\\';
            }

            System.out.print("\r" + ch + " 進度: " + percent + "%");
            System.out.flush();

            Thread.sleep(100); // 控制旋轉速度
            i++;
        }

        System.out.println("\r完成 100%          ");
    }
}