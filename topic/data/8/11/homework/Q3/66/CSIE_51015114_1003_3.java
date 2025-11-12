import java.util.Scanner;
class CSIE_51015114_1003_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt() ;
    int total=0,cnt=0 ; 
    for(int i=1 ; i<=100000;i++){
        total = i%10 + (i/10)%10 + (i/100)%10 +(i/1000)%10 + (i/10000)%10 + i/100000; 
        if(total==input)
            cnt++ ;
    }
      System.out.println(cnt);
    }
}
      
