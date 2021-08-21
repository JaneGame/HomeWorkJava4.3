public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int anuitetAge1 = service.calculate(1_000_000, 12, 9.99);
        System.out.println(anuitetAge1);
        int anuitetAge2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println(anuitetAge2);
        int anuitetAge3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println(anuitetAge3);
    }
}
