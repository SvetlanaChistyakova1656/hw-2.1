public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676; // стоимость билета
        int mileRate = 20; // количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / mileRate; // количество начисленных бонусных миль

        System.out.println("Количество начисленных миль: " + bonusMiles);
    }
}
