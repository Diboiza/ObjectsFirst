package chapterthree.clock;

public class NumberDisplay {

    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit){
        this.limit = rollOverLimit;
        value = 12;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int replacementValue) {
        if((replacementValue >= 0) && (replacementValue < limit)){
            value = replacementValue;
        }
    }

    public String getDisplayValue(){
        if(value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }

    public void increment(){
        value = (value + 1) % limit;
    }
}
