import java.util.Scanner;
class CSIE_51015108_1031_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] array= new int [n];
        for (int i=0;i<n;i++) 
        {
            array[i]=s.nextInt();
        }
        for (int i=0; i<n-1; i++) {
        int min_idx = i;
        for (int j=i+1; j<n; j++) {
            if (array[j] < array[min_idx]) {
                min_idx = j;
            }
        }
        int temp = array[min_idx];
        array[min_idx] = array[i];
        array[i] = temp;
    }
        for (int i=0; i<n; i++)
    {
        System.out.printf("%d", array[i]);
        
        if(i<n-1)
        {
        System.out.printf(" ");
        }
    }
    }
}