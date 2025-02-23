package application;

import model.services.BrazilinterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        Double ammount = sc.nextDouble();

        System.out.print("Meses: ");
        int month = sc.nextInt();
        BrazilinterestService br = new BrazilinterestService(2.0);
        double payment = br.payment(ammount, month);

        System.out.println();
        System.out.println("Pagamento apos "+ month +" meses:");
        System.out.println(String.format("%.2f", payment));
    }
}
