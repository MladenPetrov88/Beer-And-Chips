import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int countBeers = Integer.parseInt(scanner.nextLine());
        int countChips = Integer.parseInt(scanner.nextLine());

        double beerPrice = countBeers * 1.20;
        double chipsPricePerPackage = 0.45 * beerPrice;
        double chipsPrice = Math.ceil(chipsPricePerPackage * countChips);

        double totalPrice = beerPrice + chipsPrice;

        if (budget >= totalPrice) {
            double leftMoney = budget - totalPrice;
            System.out.printf("%s bought a snack and has %.2f leva left.", name, leftMoney);
        } else {
            double neededMoney = totalPrice - budget;
            System.out.printf("%s needs %.2f more leva!", name, neededMoney);
        }
    }
}
