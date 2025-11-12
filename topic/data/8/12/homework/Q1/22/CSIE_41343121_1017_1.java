 public class CSIE_41343121_1017_1{ 
  public static void main (String args[]){
      for(int i=10000;i<=100000;i+=10000){
       double pi=0.0;
       int sing=1;
       for(int n=1;n<=i;n++){
       pi +=sing*1.0/(2*n-1);
       sing=-sing;
      }
      pi=pi*4;
      if(i<=90000)System.out.printf("i =  %d, pi = %.10f%n",i,pi);
      else System.out.printf("i = %d, pi = %.10f%n",i,pi);
    }
      double po=0;
      int i=0;
      int sing=1;
      while(po<=3.14159 || po>=3.14160){
       i++;
       po=po+4*sing*1.0/(2*i-1);             
       sing=-sing;
       }
       System.out.printf("%ni = %d",i);
  
       
      

      
     }
}