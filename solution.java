import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        double sum = 0;
        
        System.out.print("Enter an integer: ");
        num = input.nextInt();
        
        for (int i=1; i <= num; i++) {
            sum += 1.0/i;
        }
        
        System.out.printf("Harmonic Serie of %d: %.3f", num, sum);
    }
}
