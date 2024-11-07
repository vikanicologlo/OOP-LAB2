
package oop.practice;

public class Main {
    public static void main(String[] args) {
        Americano americano = new Americano(Intensity.STRONG, 150);
        Cappuccino cappuccino = new Cappuccino(Intensity.NORMAL, 50);
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.LIGHT, 60, SyrupType.VANILLA);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.NORMAL, 70, 50);

        System.out.println("");
        americano.makeAmericano();

        System.out.println("");
        cappuccino.makeCappuccino();

        System.out.println("");
        syrupCappuccino.makeSyrupCappuccino();

        System.out.println("");
        pumpkinSpiceLatte.makePumpkinSpiceLatte();
    }
}
