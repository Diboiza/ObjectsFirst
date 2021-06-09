package chaptertwo.heater;

public class Heater {

    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heater(int max, int min){
        this.temperature = 15;
        this.max = max;
        this.min = min;
        this.increment = 5;
    }

    public void increaseHeat(){
        if(temperature > max){
            System.out.println("temperature can not be higher than " + max);
        }
        else {
            temperature += increment;
        }
    }

    public void decreaseHeat(){
        if(temperature < min){
            System.out.println("temperature can not be lower than " + min);
        }
        else {
            temperature -= increment;
        }
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getTemperature(){
        return temperature;
    }
}
