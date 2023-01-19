public class CreditPaymentService {
    public double calculate(int credit, int month, double percent) {
        double payment; //ежемесячный платеж
        double percentMonth = percent / (100 * 12);
        // расчет процентов в месяц

        double denominator = Math.pow((1 + percentMonth), (-month));
        // расчет знаменателя в формуле, возведение в степень

        payment = credit * (percentMonth / (1 - denominator));

        return payment;
    }
}
