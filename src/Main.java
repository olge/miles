public class Main {
    public static void main(String[] args) {
        int ticketPrice = 4990; // стоимость билета
        int rubles = 20; // количество рублей для получения одной мили
        int bonusMiles = ticketPrice / rubles; // количество бонусных миль за купленный билет

        System.out.println(("Вы получили " + bonusMiles) + " миль");


    }
}
