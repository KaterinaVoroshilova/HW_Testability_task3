
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99;
        double sum = 1000_000;
        int term = 12;
        int payment = service.calculate(percent, sum, term);
        System.out.println(payment);
        System.out.println();
        System.out.println(service.calculate(9.99, 1000000, 24));
        System.out.println();
        System.out.println(service.calculate(9.99, 1000000, 36));
    }
}
