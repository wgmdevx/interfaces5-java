package application;

import model.services.BrazilInterestService;
import model.services.InterestService;

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
        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(ammount, month);

        System.out.println();
        System.out.println("Pagamento apos "+ month +" meses:");
        System.out.println(String.format("%.2f", payment));
    }
}
