import java.util.Scanner;

public class Lesson3_6 {
    public static void main(String[] args) {
        System.out.print("введите слово: ");
        Scanner inTyping = new Scanner(System.in);
        String finalWords = inTyping.nextLine();

        System.out.println("введенное слово: " + finalWords);
    }
}
