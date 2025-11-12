
import java.util.Scanner;

public class CSIE_41343241_1003_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dataa = sc.nextInt();
        int datab = sc.nextInt();
        int datac = sc.nextInt();
        //find largest, middle, smallest using ternary operator
        int largest = (dataa>datab)?((dataa>datac)?dataa:datac):((datab>datac)?datab:datac);
        int smallest = (dataa<datab)?((dataa<datac)?dataa:datac):((datab<datac)?datab:datac);
        int middle = dataa + datab + datac - largest - smallest;
        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);
        sc.close();
    }
}
