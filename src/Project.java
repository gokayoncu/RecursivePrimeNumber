import java.util.Scanner;

public class Project {
    static void prime(int a) {
        int sayac = 0;
        for (int i = 2; i < a; i++) {
            if (a % i != 0) {
                sayac++;
                if (sayac == a - 2) {
                    System.out.print(a + " " + "is a prime number.");
                }
            } else {
                System.out.print(a + " " + "isn't a prime number.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = input.nextInt();
        prime(a);
    }
}
