public class subtraction_of_numbers {
    public static void main(String[] args) {
        int subtraction = 0;
        for (int i = 1; i <= 20; i++) {
            subtraction -= i;
            System.out.println("Subtraction of " + i + " is " + subtraction);
        }
    }
}
