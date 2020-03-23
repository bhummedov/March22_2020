package March22_2020;

public class PaintClass {
    protected String colorName;
    protected double sgrFeet;
    protected double totalPrice;

    public PaintClass(String colorName, double sgrFeet, double totalPrice) {
        this.colorName = colorName;
        this.sgrFeet = sgrFeet;
        this.totalPrice = 0;
    }

    double calculatePrice(){
        double totalPrice= this.sgrFeet/100*32.99;
        this.totalPrice=totalPrice;
        return this.totalPrice;

    }

    @Override
    public String toString() {
        return "PaintClass{" +
                "colorName='" + colorName + '\'' +
                ", sgrFeet=" + sgrFeet +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
