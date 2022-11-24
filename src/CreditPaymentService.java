public class CreditPaymentService {
    // kredit сумма кредита
    // percent процентная ставка
    // manth кол-во месяцев
    public double calculate(double kredit, double percent, double manth) {
        //Месячная процентная ставка
        double manthPercent = percent / 12 / 100;
        //Коэффициэнт аннуитета
        double coefficent = manthPercent * Math.pow((1 + manthPercent), manth) / (Math.pow((1 + manthPercent), manth) - 1);
        //Аннуитетный взнос
        double vznos = coefficent * kredit;
        int otv = (int) vznos;

        return otv;

    }
}
