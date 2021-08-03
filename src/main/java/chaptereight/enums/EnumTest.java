package chaptereight.enums;

import java.util.Date;

public class EnumTest {
    Day day;
    Date date;

    public EnumTest(Day day){
        this.day = day;
        this.date = new Date();
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void tellIt(){
        switch (day){
            case SUNDAY -> System.out.println("Sundays are for church");
            case MONDAY -> System.out.println("Mondays are for mogodu");
            case TUESDAY -> System.out.println("Tuesdays are now officially recovery days");
            case WEDNESDAY -> System.out.println("Wednesday are the worst days a man can experience");
            case THURSDAY -> System.out.println("Thursday is back to the drinking, phuza thursday");
            case FRIDAY -> System.out.println("Ladies and gentleman, THE WEEKEND!!");
            case SATURDAY -> System.out.println("Let's get ready to rumble");
        }
    }


    public void printAllEnums(){
        for (Day d: Day.values()) {
            System.out.println("The day is: " + d);
        }
    }
}
