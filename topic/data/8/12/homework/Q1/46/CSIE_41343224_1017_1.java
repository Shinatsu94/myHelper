/**
 * 程式名稱 : PI
 * 
 * 功能說明：程式輸出PI
 *
 * 日期:2025/10/03
 *
 * 姓名:張竣傑
 *	
 * 學號:41343224
 * 
 * 請給我100分!!
 */
 public class CSIE_41343224_1017_1{
 
     public static void main(String args[]){
         
         double sum = 0;
         for(int i=1;i<=150000;i+=1){
            
	    if((i%2)==0)
            sum+=(-(1.0/(2*i-1)));
	    else
	    sum+=((1.0/(2*i-1)));

            if(i<=100000 && (i%10000)==0)
                System.out.printf("i = %6d, pi = %.10f \n", i,sum*4);
	    int count = (int)(sum*4 * 100000);
	    if(count == 314159){
	        System.out.printf("\ni = %6d",i);
                break;
            	}
	    }
    

         
     }
 }