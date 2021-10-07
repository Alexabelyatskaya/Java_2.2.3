public class CreditPaymentService {
    public long calculate(int loanAmount, int months) {
        double interestRate = 9.99;
        double ratio = interestRate / 100 / 12;

        long monthlyPayment = Math.round(loanAmount * (ratio + (ratio / (Math.pow((ratio + 1), months) - 1))));

        return monthlyPayment;
    }
}