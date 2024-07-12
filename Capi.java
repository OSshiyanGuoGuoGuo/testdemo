public class Capi1 {
    private int value1;
    private int value2;
    private int value3;
    // add parameter
    public void doSomething(int param1, int param2, int param3) {
        int result = param1 + param2 + param3;
        int doubledResult = result * 2;
        System.out.println("Result: " + doubledResult);
    }
    
    // delete parameter
    public void showValue(int param1) {
        System.out.println(param1);
    }
    
    // add method
    public void setValue1(int value1) {
        this.value1 = value1;
    }
    // delete method addV1V2
    
    
    
    // Extract Method
    private int calculateDoubleValue(int value) {
        return value * 2;
    }

    public int getDoubleValueOfSum(int value1, int value2) {
        int sum = value1 + value2;
        return calculateDoubleValue(sum);
    }
    // Inline Method
    public void printSumOfValues() {
        System.out.println("Sum of values: " + (value1 + value2 + value3));
    }

   
   
   
    // Change method modifier from public to protected
    protected int getTripleValue(int value) {
        return value * 3;
    }

    
}