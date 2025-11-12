import java.util.Scanner;

class CSIE_51015114_1017_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ans =input ;
        if (input/10 == 0) {
            System.out.println(" is well-ordered number.");
        } else {
            while (input > 0) {
                if((input/10)%10>=input%10){
                    break;
                }
                input /= 10;
            }
            if(input<=0){
                 System.out.println(ans + " is well-ordered number.");
            }
            else
                System.out.println(ans + " is not well-ordered number.");
        }
    }
}
