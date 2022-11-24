public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // kredit сумма кредита
        // percent процентная ставка
        // manth кол-во месяцев

        System.out.println();
        System.out.println("Срок кредита 12мес.");
        System.out.println(service.calculate(1_000_000, 9.99, 12));

        System.out.println();
        System.out.println("Срок кредита 24мес.");
        System.out.println(service.calculate(1_000_000,9.99,24));

        System.out.println();
        System.out.println("Срок кредита 36мес");
        System.out.println(service.calculate(1_000_000, 9.99,36));

    }
}
