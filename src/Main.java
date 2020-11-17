public class Main {
    public static void main(String[] args) {
       int TicketPriceInKopecks = 999999;
       int Tariff = 20;
       int AviaMiles = TicketPriceInKopecks / Tariff / 100;
        System.out.println("Количество начисленных миль за купленный билет (когда учитыватся только целая часть значения миль):");
        System.out.println(AviaMiles);
        System.out.println("Done");

        float TicketPrice = 9999.99F;
        float Tariff1 = 20;
        float AviaMiles1 = TicketPrice / Tariff1;
        System.out.println("Количество начисленных миль за купленный билет (когда учитыватся дробная часть значения миль):");
        System.out.println(AviaMiles1);
        System.out.println("Done");
    }
}
