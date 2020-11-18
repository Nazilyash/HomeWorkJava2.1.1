public class Main {
    public static void main(String[] args) {
       int ticketPriceInKopecks = 999999;
       int tariff = 20;
       int aviaMiles = ticketPriceInKopecks / tariff / 100;
        System.out.println("Количество начисленных миль за купленный билет:");
        System.out.println(aviaMiles);
        System.out.println("Done");
    }
}
