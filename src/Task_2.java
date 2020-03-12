import java.io.*;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        try {
            String s;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите первое число: ");
            double x = Double.parseDouble(reader.readLine());
            System.out.println("Выберите операцию: +, -, / или *");
            s = reader.readLine();
            System.out.println("Введите второе число:");
            double y = Double.parseDouble(reader.readLine());
            if (s.equals("+")) {
                System.out.print("Результат сложения равен ");
                System.out.printf("%.4f", (x + y));
            }
            if (s.equals("-")) {
                System.out.print("Результат разности равен ");
                System.out.printf("%.4f", (x - y));
            }
            if (s.equals("/")) {

                if (y == 0) throw new ArithmeticException("Деление на ноль запрещено");
                System.out.print("Результат деления равен ");
                System.out.printf("%.4f", (x / y));
            }
            if (s.equals("*")) {
                System.out.print("Результат произведения равен ");
                System.out.printf("%.4f", (x * y));
            }

        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 запрещено");
        }
    }
}