import java.util.Scanner;

public class CSIE_41343232_1031_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int score[] = new int[number];

        for(int i = 0; i < number; i++) {
            score[i] = input.nextInt();
        }

        for(int i = 0; i < number - 1; i++) {
            int min = i;
            for(int j = i + 1; j < number; j++) {
                if(score[min] > score[j]) {
                    min = j;
                }
            }

            if(min != i) {
                int temp = score[i];
                score[i] = score[min];
                score[min] = temp;
            }
        }

        for(int i = 0; i < number; i++) {
            System.out.print(score[i] + " ");
        }

        input.close();
    }
}
