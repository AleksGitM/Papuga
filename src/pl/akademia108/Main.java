package pl.akademia108;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wprowadź słowo:");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println("Kra, kra, " + word + " " + word);
        scan.close();
    }
}
