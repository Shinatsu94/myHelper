public class CSIE_41343111_0926_3{
   public static void main(){
      int num;
      Scanner scanner = new Scanner(System.in);
      while(true){
         num = scanner.nextInt();
         if(num>=60)
            System.out.println("及格");
         else if(num>=50)
            System.out.println("補考");
         else
            System.out.println("不及格");
      }
   }
}