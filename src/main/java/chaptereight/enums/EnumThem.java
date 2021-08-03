package chaptereight.enums;

public class EnumThem {
    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(Day.MONDAY);

        enumTest.printAllEnums();
        enumTest.tellIt();
        enumTest.setDay(Day.FRIDAY);
        enumTest.tellIt();
        enumTest.setDay(Day.WEDNESDAY);
        enumTest.tellIt();
    }
}
