public class CSIE_41343219_0926_2 {
    public static void main(String[] args) throws Exception{
        int person=0;
        String icon = "/-\\|/-\\|";
        while(person<=100)
        {
            for(int i = 0;i<7;i++)
            {
                System.out.print("\r"+icon.charAt(i)+"... "+person+"%");
                Thread.sleep(100);
            }
            person+=Math.random()*10;
        }
        System.out.print("\rSuccess!!");
    }
}
