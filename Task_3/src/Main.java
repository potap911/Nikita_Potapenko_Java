import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = input();
        calcAndOutput(numbers);
    }

    public static ArrayList<Integer> input() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Введите последовательность чисел через пробел, окончание последовательности - буквенный символ!");
        while (scan.hasNextInt()) {
            numbers.add(scan.nextInt());
        }
        return numbers;
    }

    public static void calcAndOutput(ArrayList<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 3 == 0)
                .forEach(num -> System.out.println(num + " "));
    }
}