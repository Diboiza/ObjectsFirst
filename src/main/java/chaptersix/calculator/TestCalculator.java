package chaptersix.calculator;

public class TestCalculator {
    public static void main(String[] args) {
        CalcEngineTester test = new CalcEngineTester();

        test.testAll();

        System.out.println(test.testPlus());
        System.out.println(test.testPlus());

    }
}
