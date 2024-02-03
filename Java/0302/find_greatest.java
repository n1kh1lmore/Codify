import java.util.Scanner;

public class find_greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("First number is greater");
        }else{
            System.out.println("Second number is greater");
        }
        sc.close();

    }
}
