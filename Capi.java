public class Capi {
    private int value1;
    private int value2;
    private int value3;

    public void doSomething(int param1, int param2) {
        int result = param1 + param2;
        int doubledResult = result * 2;
        System.out.println("Result: " + doubledResult);
    }


    public void showValue(int param1, int param2) {
        System.out.println(param1 + " " + param2);
    }


    
    


    public int addV1V2(int value1, int value2) {
        return value1 + value2;
    }

    public int getDoubleValueOfSum(int value1, int value2) {
        int sum = value1 + value2;
        return sum * 2;
    }






    public int getSumOfValues() {
        return value1 + value2 + value3;
    }

    public void printSumOfValues() {
        System.out.println("Sum of values: " + getSumOfValues());
    }

    public int getTripleValue(int value) {
        return value * 3;
    }
    
}