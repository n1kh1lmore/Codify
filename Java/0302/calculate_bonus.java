import java.util.Scanner;

public class calculate_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        System.out.println("Enter your years of service");
        int years = sc.nextInt();
        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("Your bonus is " + bonus);
        sc.close();
    }
}
