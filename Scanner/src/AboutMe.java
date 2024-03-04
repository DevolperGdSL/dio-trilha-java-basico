import java.util.Locale;
import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome:");
        String name = scanner.next();
        System.out.println("Digite seu sobrenome:");
        String lastName = scanner.next();
        System.out.println("Digite sua idade:");
        int yearsOld = scanner.nextInt();
        System.out.println("Digite sua altura:");
        double stature = scanner.nextDouble();

        System.out.println("Olá me chamo: "+ name + " " + lastName);
        System.out.println("Minha idade: " + yearsOld);
        System.out.println("Minha altura: " + stature + "m");
    }
}
