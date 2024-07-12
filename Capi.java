public class Capi {
    private int value1;
    private int value2;
    private int value3;

    public void doSomething(int param1, int param2, int param3) {
        int result = param1 + param2 + value3;
        int doubledResult = result * 2;
        System.out.println("Result: " + doubledResult);
    }

    public int getTripleValue(int value) {
        return value * 3;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public int calculateDiscount(int originalPrice, int discountPercentage) {
        int discountAmount = originalPrice * discountPercentage / 100;
        return originalPrice - discountAmount;
    }
}