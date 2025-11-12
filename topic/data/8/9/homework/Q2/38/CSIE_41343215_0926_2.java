public class CSIE_41343215_0926_2{
   public static void main(String[] args) throws Exception{
    char[] spinner = {'/', '-', '\\','|'};
    int i=0;
    int j=0;
    while(true){
        System.out.print("\r" + spinner[i % 4] + "  進度: " + j + "%  ");
        if (j >= 100) break;
        Thread.sleep(100);
        i++;
        j++;
    }
    }
}