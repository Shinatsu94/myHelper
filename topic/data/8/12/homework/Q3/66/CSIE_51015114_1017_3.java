import java.util.Scanner;

class CSIE_51015114_1017_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int cnt = 0;
        int input_1=0 ;
        input_1=input ;
        if (input==0) {
            cnt = 1;
        } else {
            while (input > 0) {
                input /= 10;
                cnt++;
            }
        }
       int ans=0 ;
       for(int i=cnt; i>0 ; i--){
            ans=ans+(int)((input_1%10)*Math.pow(10,i-1)) ;
            input_1 /= 10;
       }
        System.out.println(ans);
    }
}
