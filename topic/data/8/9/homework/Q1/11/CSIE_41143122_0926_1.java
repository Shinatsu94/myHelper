//package h4w;

public class CSIE_41143122_0926_1 {
    public static void main(String[] args){
        char c1 = '虎';
        char c2 = '科';
        char c3 = '大';
        char c4 = '林';
        char c5 = '柏';
        char c6 = '儒';

        // 輸出結果
        printBinary(c1);
        printBinary(c2);
        printBinary(c3);
        printBinary(c4);
        printBinary(c5);
        printBinary(c6);
    }

    private static void printBinary(char c) {
        String binary = String.format("%16s", Integer.toBinaryString(c))
                            .replace(' ', '0'); // 補滿16位
        System.out.println(c +" "+ binary);
    }
}
