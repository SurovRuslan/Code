import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        while (true) {
            System.out.println("ВВедите текст:");
            Scanner myObj = new Scanner(System.in);
            String usersText = myObj.nextLine();
            if (usersText.isEmpty()) {
                System.out.println("Вы ничего не ввели");
            } else System.out.println("В тесте, который Вы ввели, " + usersText.length() + " символов");
            System.out.println(usersText.substring(usersText.length()-4));
            break;
        }
    }
}