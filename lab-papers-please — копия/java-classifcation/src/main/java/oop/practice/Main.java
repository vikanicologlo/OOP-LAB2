package oop.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barista barista = new Barista();

        System.out.println("What would you like to drink?");
        System.out.println("1. Americano");
        System.out.println("2. Cappuccino");
        System.out.println("3. Syrup Cappuccino");
        System.out.println("4. Pumpkin Spice Latte");
        System.out.print("Enter number of coffee: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You've chosen Americano.");
                System.out.println("Intensity (0: LIGHT, 1: NORMAL, 2: STRONG): ");
                Intensity intensityAmericano = Intensity.values()[scanner.nextInt()];
                System.out.println("Enter ml of water: ");
                int water = scanner.nextInt();
                barista.makeAmericano(intensityAmericano, water);
                break;
            case 2:
                System.out.println("You've chosen Cappuccino.");
                System.out.println("Intensity (0: LIGHT, 1: NORMAL, 2: STRONG): ");
                Intensity intensityCappuccino = Intensity.values()[scanner.nextInt()];
                System.out.println("Enter ml of milk: ");
                int milk = scanner.nextInt();
                barista.makeCappuccino(intensityCappuccino, milk);
                break;
            case 3:
                System.out.println("You've chosen Syrup Cappuccino.");
                System.out.println("Intensity (0: LIGHT, 1: NORMAL, 2: STRONG): ");
                Intensity intensitySyrupCappuccino = Intensity.values()[scanner.nextInt()];
                System.out.println("Enter ml of milk: ");
                int milkSyrup = scanner.nextInt();
                System.out.println("Syrup (0: MACADAMIA, 1: VANILLA, 2: COCONUT, 3: CARAMEL, 4: CHOCOLATE, 5: POPCORN): ");
                SyrupType syrup = SyrupType.values()[scanner.nextInt()];
                barista.makeSyrupCappuccino(intensitySyrupCappuccino, milkSyrup, syrup);
                break;
            case 4:
                System.out.println("You've chosen Pumpkin Spice Latte.");
                System.out.println("Intensity (0: LIGHT, 1: NORMAL, 2: STRONG): ");
                Intensity intensityLatte = Intensity.values()[scanner.nextInt()];
                System.out.println("Enter ml of milk: ");
                int milkLatte = scanner.nextInt();
                System.out.println("Enter mg of pumpkin spice: \n");
                int pumpkinSpice = scanner.nextInt();
                barista.makePumpkinSpiceLatte(intensityLatte, milkLatte, pumpkinSpice);
                break;
            default:
                System.out.println("Wrong choice.");
                break;
        }

        scanner.close();
    }
}