public class Capi1 {
    private int value1;
    private int value2;
    private int value3;
    // add parameter
    public void doSomething(int param1, int param2, int param3) {
        int result = calculateSum(param1, param2) + param3;
        int doubledResult = getDoubleValue(result);
        System.out.println("Result: " + doubledResult);
    }
    // extract method
    private int calculateSum(int a, int b) {
        return a + b + value3;
    }
    // add method
    private int getDoubleValue(int value) {
        return value * 2;
    }
    // delete method: getTripleValue()
    // delete parameter
    public int calculateArea(int length) {
        return length * length;
    }

    public int calculateDiscount(int originalPrice, int discountPercentage) {
        int discountAmount = getDiscountAmount(originalPrice, discountPercentage);
        return originalPrice - discountAmount;
    }
    // inline method
    private int getDiscountAmount(int price, int percentage) {
        return price * percentage / 100;
    }
}