import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        char operator = ' ';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+' || input.charAt(i) == '-' || 
                input.charAt(i) == '*' || input.charAt(i) == '/') {
                operator = input.charAt(i);
                break;
            }
        }
        
        String[] parts = input.split("[" + operator + "]");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        
   
        int result = 0;
        if (operator == '+') {
            result = A + B;
        } else if (operator == '-') {
            result = A - B;
        } else if (operator == '*') {
            result = A * B;
        } else if (operator == '/') {
            result = A / B;
        }
        
        System.out.println(result);
    }
}