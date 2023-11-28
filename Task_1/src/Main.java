import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number:");
        int num = scan.nextInt();
        if (num > 7)
            System.out.println("Привет");
    }
}