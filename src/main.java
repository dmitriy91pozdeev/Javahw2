public class main {
    public static void main(String[] args) {

        int price_ticket = 15000; // цена билета
        int price_bonus = 20; // количество рублей за одну бонусную милю
        int mili = price_ticket / price_bonus; // количество начисленных миль


        System.out.println("Цена билета: " + price_ticket + " рублей(я)");
        System.out.println("Начислено: " + mili + " миль(я)");


    }
}