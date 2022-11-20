public class CreditPaymentService {
    // k сумма кредита
    // p процентная ставка
    // m кол-во месяцев
    public double calculate(double k, double p, double m) {
        //месячная процентная ставка
        double s;
        s = p / 12 / 100;
        //коэффициэнт аннуитета
        double a;
        a = 1 + s;
        double x = Math.pow(a,m); // (1 + процент в кол-ве мес.)
        double t;
        t = x * s;//1
        double y;
        y = x - 1;//2
        double u;
        u = t / y;
        //Аннуитетный взнос
        double fif;
        fif = u * k;
        int otv = (int) fif;

        return otv;

    }
}
