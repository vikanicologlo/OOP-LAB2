package oop.practice;

class Barista {
    public void makeAmericano(Intensity intensityOfCoffee, int mlOfWater){
        Americano americano = new Americano(intensityOfCoffee, mlOfWater);
        americano.makeAmericano();
    }

    public void makeCappuccino(Intensity intensity, int mlOfMilk){
        Cappuccino cappuccino = new Cappuccino(intensity, mlOfMilk);
        cappuccino.makeCappuccino();
    }

    public void makeSyrupCappuccino(Intensity intensityCoffee, int mltrOfMilk, SyrupType syrup) {
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(intensityCoffee, mltrOfMilk, syrup);
        syrupCappuccino.makeSyrupCappuccino();
    }

    public void makePumpkinSpiceLatte(Intensity intensityOfCoffee, int mlOfMilk, int mgOfPumpkinSpice) {
        PumpkinSpiceLatte latte = new PumpkinSpiceLatte(intensityOfCoffee, mlOfMilk, mgOfPumpkinSpice);
        latte.makePumpkinSpiceLatte();
    }
}