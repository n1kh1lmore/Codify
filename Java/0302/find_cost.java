import java.util.Scanner;

public class find_cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units");
        int units = sc.nextInt();
        double cost = units * 100;
        if(cost>1000){
        
            cost = (cost -(cost * 0.1) );
            System.out.println("Cost is " + cost);
        }else{
    
            System.out.println("Cost is " + cost);
        }
        sc.close();
    }
}
