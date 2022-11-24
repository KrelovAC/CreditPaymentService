public class CreditPaymentService {
    // kredit сумма кредита
    // percent процентная ставка
    // manth кол-во месяцев
    public double calculate(double kredit, double percent, double manth) {
        //месячная процентная ставка
        double mPercent = percent / 12 / 100;
        //коэффициэнт аннуитета
        double coef = mPercent * Math.pow((1 + mPercent), manth) / (Math.pow((1 + mPercent), manth) - 1);
        //Аннуитетный взнос
        double vznos = coef * kredit;
        int otv = (int) vznos;

        return otv;

    }
}
