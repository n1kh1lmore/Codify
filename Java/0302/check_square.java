import java.util.Scanner;

public class check_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
int l = sc.nextInt();
System.out.println("Enter the breadth of the rectangle");
int b = sc.nextInt();
if (l == b) {
    System.out.println("Its square");
}else{
    System.out.println("Its rectangle");
}
        sc.close();
    }
}
