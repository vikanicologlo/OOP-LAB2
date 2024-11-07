package oop.practice;

enum Intensity {
    LIGHT, NORMAL, STRONG
}

enum SyrupType {
    MACADAMIA, VANILLA, COCONUT, CARAMEL, CHOCOLATE, POPCORN
}

abstract class Coffee {
    private Intensity coffeeIntensity;
    private String name;

    protected Coffee(Intensity coffeeIntensity, String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void printCoffeeDetails() {
        System.out.println("Intensity set to " + coffeeIntensity);
    }

}

class Americano extends Coffee {
    private int mlOfWater;

    public Americano(Intensity intensityOfCoffee, int mlOfWater) {
        super(intensityOfCoffee, "Americano");
        this.mlOfWater = mlOfWater;
    }

    public final Americano makeAmericano() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        System.out.println("Adding " + mlOfWater + " ml of water");
        return this;
    }
}

class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity, "Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public final Cappuccino makeCappuccino() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        System.out.println("Adding " + mlOfMilk + " ml of milk");
        return this;
    }

    public void printDetails() {
        super.printCoffeeDetails();
        System.out.println(getName() + " milk: " + mlOfMilk + " ml");
    }
}

class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity intensityCoffee, int mltrOfMilk, SyrupType syrup) {
        super(intensityCoffee, mltrOfMilk);
        this.syrup = syrup;
    }

    public final SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        System.out.println("Adding " + getMlOfMilk() + " ml of milk");
        System.out.println("Adding syrup: " + syrup);
        return this;
    }

    @Override
    public String getName() {
        return "SyrupCappuccino";
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Syrup: " + syrup);
    }
}

class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensityOfCoffee, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensityOfCoffee, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public final PumpkinSpiceLatte makePumpkinSpiceLatte() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        System.out.println("Adding " + getMlOfMilk() + " ml of milk");
        System.out.println("Adding " + mgOfPumpkinSpice + " mg of pumpkin spice");
        return this;
    }

    @Override
    public String getName() {
        return "PumpkinSpiceLatte";
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Pumpkin spice: " + mgOfPumpkinSpice + " mg");
    }
}