import java.util.Scanner;

public class Programm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X");
        int x = scanner.nextInt();
        System.out.println("Введите Y");
        int y = scanner.nextInt();
        System.out.println("Введите оператор +, -, *, /");
        String oper = scanner.next();
        switch (oper){
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Неизвестный оператор");
        }

    }
}
