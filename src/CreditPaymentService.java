public class CreditPaymentService {
    public int calculate(double p, double s, int t) {
        double degree = Math.pow(1 + p / 1200, t);
        double pay = s * (p / 1200) * degree / (degree - 1);
        return (int) pay;
    }
}
