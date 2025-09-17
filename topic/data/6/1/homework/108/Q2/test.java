import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入座標
        //System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        //System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // 歐拉距離
        double euclidean = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        // 城市街區距離
        double cityBlock = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        // 謝比雪夫距離
        double chebyshev = Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));

        // 輸出結果
        //System.out.println("Euclidean Distance: " + euclidean);
        System.out.println(euclidean);
        //System.out.println("City Block Distance: " + cityBlock);
        System.out.println(cityBlock);
        //System.out.println("Chebyshev Distance: " + chebyshev);
        System.out.println(chebyshev);

        sc.close();
    }
}