public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;

        int oneYear = 12;
        int towYears = 24;
        int threeYears = 36;

        long paymentOneYear = service.calculate(loanAmount, oneYear);
        System.out.println(paymentOneYear);

        long paymentTowYears = service.calculate(loanAmount, towYears);
        System.out.println(paymentTowYears);

        long paymentThreeYears = service.calculate(loanAmount, threeYears);
        System.out.println(paymentThreeYears);
    }
}