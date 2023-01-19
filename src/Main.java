public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000; // сумма кредита
        int month = 1 * 12; // срок кредита в месяцах
        double percent = 9.99; //процентная ставка годовых
        double payment = service.calculate(credit, month, percent);
        System.out.println("Сумма кредита: " + credit);
        System.out.println("Процентов годовых: " + percent);
        System.out.println();

        System.out.println("Расчет для 1 года");
        System.out.println("Ежемесячный платеж: " + (int) payment);

        System.out.println();
        System.out.println("Расчет для 2 лет");
        System.out.println("Ежемесячный платеж: " + (int) service.calculate(credit, 24, percent));

        System.out.println();
        System.out.println("Расчет для 3 лет");
        System.out.println("Ежемесячный платеж: " + (int) service.calculate(credit, 36, percent));

    }
}