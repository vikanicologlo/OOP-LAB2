package oop.practice;

enum Intensity {
    LIGHT, NORMAL, STRONG
}

enum SyrupType {
    MACADAMIA, VANILLA, COCONUT, CARAMEL, CHOCOLATE, POPCORN
}

class Coffee {
    private Intensity coffeeIntensity;
    private  String name;

    public Coffee(Intensity coffeeIntensity,String name) {
        this.coffeeIntensity = coffeeIntensity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printCoffeeDetails() {
        System.out.println("Coffee intensity: " + coffeeIntensity);
    }

    public void printDetails() {
        printCoffeeDetails();
    }
}

class Americano extends Coffee {
    private int mlOfWater;

    public Americano(Intensity intensityOfCoffee, int mlOfWater) {
        super(intensityOfCoffee,"Americano");
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printDetails() {
        super.printCoffeeDetails();
        System.out.println(getName() + " water: " + mlOfWater + " ml");
    }
}

class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity,"Cappuccino");
        this.mlOfMilk = mlOfMilk;
    }
    @Override
    public void printDetails() {
        super.printCoffeeDetails();
        System.out.println(getName() + " milk: " + mlOfMilk + " ml");
    }
}


class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity intensityCoffee,int mltrOfMilk, SyrupType syrup) {
        super(intensityCoffee,mltrOfMilk);
        this.syrup = syrup;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Syrup: " + syrup);
    }

    @Override
    public String getName() {
        return "SyrupCappuccino";
    }
}


class PumpkinSpiceLatte extends Cappuccino {
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensityOfCoffee, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensityOfCoffee, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;

    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Pumpkin spice: " + mgOfPumpkinSpice + " mg");
    }

    @Override
    public String getName() {
        return "PumpkinSpiceLatte";
    }
}
