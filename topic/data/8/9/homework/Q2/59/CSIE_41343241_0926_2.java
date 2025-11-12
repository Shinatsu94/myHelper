/*
 * project name: CSIE_41343241_0926_2
 * file name: CSIE_41343241_0926_2.java
 * funtion: show a loading bar
 */
public class CSIE_41343241_0926_2 {
    
    public static void main(String[] args) throws Exception
    {
        int run=0;
        /*       while(run<=100)
        {
            System.out.print("\r"+"-"+" "+run+"%");
            System.out.flush();
            Thread.sleep(100);
            System.out.print("\r"+"\\"+" "+run+"%");
            System.out.flush();
            Thread.sleep(100);
            System.out.print("\r"+"|"+" "+run+"%");
            System.out.flush();
            Thread.sleep(100);
            System.out.print("\r"+"/"+" "+run+"%");
            System.out.flush();
            Thread.sleep(100);
            System.out.print("\r"+"-"+" "+run+"%");
            System.out.flush();
            Thread.sleep(100);
            run+=10;
            
        }*/
        char[] a = {'-','\\','|','/'};
        while(run<=100)
        {
            for(int i=0;i<4;i++)
            {
                System.out.print("\r"+a[i]+" "+run+"%");//\r means return to the beginning of the line
                System.out.flush();
                Thread.sleep(100);
            }
            run+=10;
        }
    }
}

