package March22_2020;

public class CustomerPaintClass extends PaintClass {
    protected String durability;
    protected String glossiness;

    public CustomerPaintClass(String glossiness, String durability, double durable, double superDurable, String colorName, double sgrFeet, double totalPrice) {
        super(colorName, sgrFeet, totalPrice);
        this.durability = durability;
        this.glossiness = glossiness;
    }

    public void changeGlossiness(String newGloss) {
        this.glossiness = newGloss;
    }

    public void changeDurability(String newDurability) {
        this.durability = newDurability;
    }

    public double calculateCustomerPrice() {
        double pricePerGallon = 32.99;
        if (this.glossiness.equalsIgnoreCase("glossy")) {
            pricePerGallon += 2;
        } else if (this.glossiness.equalsIgnoreCase("extraGlossy")) {
            pricePerGallon += 3;
        } else if (this.durability.equalsIgnoreCase("durable")) {
            pricePerGallon += 2;
        } else if (this.durability.equalsIgnoreCase("extraDurable")) {
            pricePerGallon += 3;
        }
        super.totalPrice=super.sgrFeet/100*pricePerGallon;
        return super.totalPrice;
    }
}
