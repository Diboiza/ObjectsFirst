package chaptersix.calculator;

/**
 * The main part of the calculator
 * perfoming the arithmetic logic if the calculations
 * @author: Bongani Maphiri
 * @version 1.0
 */
public class CalcEngine {

    //The value in the display
    private int displayValue;
    //The previous operator type
    private char previousOperator;
    //the left operand to the previousOperator
    private int leftOperand;

    /**
     * create a Calc instance
     */

    public CalcEngine(){
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
    }

    /**
     * @return the value currently displayed
     * on the calcultor
     */
    public int getDisplayValue() {
        return displayValue;
    }

    /**
     * a number button was pressed
     * @param number that pressed
     */
    public void pressedNumber(int number){
        displayValue = displayValue * 10 + number;
    }

    /**
     * the '+' button was pressed
     */
    public void plus(){
        applyPreviousOperator();
        previousOperator = '+';
        displayValue = 0;
    }

    /**
     * the '-' button was pressed
     */
    public void minus(){
        applyPreviousOperator();
        previousOperator = '-';
        displayValue = 0;
    }

    /**
     * the '=' button was pressed
     */
    public void equals() {
        if (previousOperator == '+') {
            displayValue = leftOperand + displayValue;
        } else {
            displayValue = leftOperand - displayValue;
        }
        leftOperand = 0;
    }

    /**
     * The 'C' clear button was pressed
     */
    public void clear(){
        displayValue = 0;
    }

    /**
     * return the title of this calculator engine
     */

    public String getTitle(){
        return "Super Calculator";
    }

    /**
     * return the author of this engine
     */
    public String getAuthor(){
        return "Bongani Maphiri";
    }

    /**
     * get the version of this engine
     */

    public String getVersion(){
        return "Version 1.0";
    }

    /**
     * An operator button has been pressed.
     * Apply the immediately preceding operator to
     * calculate an intermediate result. This will
     * form the left operand of the new operator.
     */
    private void applyPreviousOperator()
    {
        if(previousOperator == '+') {
            leftOperand += displayValue;
        }
        else if(previousOperator == '-') {
            leftOperand -= displayValue;
        }
        else {
            // There was no preceding operator.
            leftOperand = displayValue;
        }
    }
}
