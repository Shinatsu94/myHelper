public class CSIE_41343217_0926_2 {
    
    public static void main(String[] args) throws Exception { 
        
        runAnimation();
        
    }
    
    public static void runAnimation() throws Exception {
        
        char[] spinner = {'|', '/', '-', '\\'}; 

        for (int i = 5; i <= 100; i += 5) {

            for (int j = 0; j < spinner.length; j++) {
                
                System.out.print("\r" + spinner[j] + " ");
                
                System.out.print( i + "%");

                Thread.sleep(100); 
            }
        }
        
        System.out.println();
    }
}