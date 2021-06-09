package chapterthree.clock;

public class RunClock {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay();

        System.out.println(clockDisplay.getTime());
        clockDisplay.setTime(23,59);
        System.out.println(clockDisplay.getTime());
        clockDisplay.timeTick();
        clockDisplay.timeTick();
        clockDisplay.timeTick();
        clockDisplay.updateDisplay();
        System.out.println(clockDisplay.getTime());

    }
}
