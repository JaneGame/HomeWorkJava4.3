public class CreditPaymentService {
    public int calculate(int money, int time, double pay) {
        double payMini = pay / 12 / 100;
        double anuitetCoefficient = payMini * Math.pow((1 + payMini), time) / (Math.pow((1 + payMini), time) - 1);
        int anuitet = (int) (anuitetCoefficient * money);
        return anuitet;
    }
}
