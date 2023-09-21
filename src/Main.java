public class Main {
    public static void main(String[] args) {

        int priceTicket = 15000; // цена билета
        int priceBonus = 20; // количество рублей за одну бонусную милю
        int mili = priceTicket / priceBonus; // количество начисленных миль


        System.out.println("Цена билета: " + priceTicket + " рублей(я)");
        System.out.println("Начислено: " + mili + " миль(я)");


    }
}