/* file name: CSIE_41343212_0926_2.java
   student: 李品劭
   ID: 41343212
   function: to print spinner /
 */
public class CSIE_41343212_0926_2 {
    public static void main(String[] args) throws Exception {
        char [] spinChars = {'/', '-', '\\', '|'};
        int current = 0;
        while (current <= 100) {
            for (char c : spinChars) {
                if (current >= 100) break;
                ++current;
                System.out.print("\r" + c + " " +  current + "%");
                Thread.sleep(100);
            }
        }
    }
}
