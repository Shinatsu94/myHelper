//package h4w;
import java.util.Scanner;
import java.util.ArrayList;
/*
    filename: CSIE_41143122_1017_2.java
    function: 檢查使用者輸入值是否為「良序數」
              (此處定義為：每兩位相鄰數字的差值相同，亦即各位形成等差數列)
      author: 林柏儒 資工四甲 41143122
    datetime: 2025/10/17
     version: 1.0
*/
public class CSIE_41143122_1017_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //System.out.printf("請輸入：");
        int scn = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        int sum=0;
        for(int i=scn;i>0;i=i/10){
            array.add(i%10);
            //System.out.println(array.get(0));
        }

        /*for(int j=0;j<array.size();j++){
            System.out.println(array.get(j));
        }*/

        // 若位數不足兩位，視為 well-ordered
        if (array.size() < 2) {
            System.out.println(scn + " is well-ordered number.");
            scanner.close();
            return;
        }

        boolean first = true;
        boolean wellOrdered = true;

        for(int j=0;j<array.size()-1;j++){
            if(first){
                sum=array.get(j)-array.get(j+1);
                //System.out.println("sum="+sum);
                first = false;
            }else{
                if(sum!=array.get(j)-array.get(j+1)){
                    System.out.println(scn+" is not well-ordered number.");
                    wellOrdered = false;
                    break;
                }
            }
        }
        if(wellOrdered)
            System.out.println(scn + " is well-ordered number.");

        scanner.close();
    }
}
