package March22_2020;

public class PaintsTests {
    public static void main(String[] args) {
    PaintClass myPaint = new PaintClass("zero grivity", 2800, 0);
    System.out.println((myPaint.toString()));
    System.out.println(myPaint.calculatePrice());
    CustomerPaintClass myCustomPaint = new CustomerPaintClass("moon blue","3200",12,15, "white", 2800, 2500);
    System.out.println(myCustomPaint.calculateCustomerPrice());

    }
}
