// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CSIE_51015108_1017_1 {
    public static void main(String[] args) {
        int a=376850; 
        int p=4*314159;
        double d=0,b;
        int c=1;
        for(int i=0;i<=a;i++)
        {   b=1.0/(2 * i + 1);
            if(i%2==0)
            {
            d=d+b;
             c=0; 
            }
            else
            {
                d=d-b;
            c=1;  
            }
            
             if (((i + 1) % 10000 == 0) && i <= 100005) 
            {
                System.out.printf("i = %6d, pi = %.10f\n", i+1, d * 4);
            }
        
            if(i==136120)
            {
                System.out.printf("\n");
            System.out.printf("i = %6d", i+1);
            }
        }
    } 
    }


