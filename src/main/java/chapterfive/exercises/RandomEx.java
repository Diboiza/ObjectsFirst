package chapterfive.exercises;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomEx {

    private Random random;


    public RandomEx(){
        random = new Random();
    }

    public void printOneRandom(){
        int randomNum = random.nextInt();
        System.out.println("randomNum = " + randomNum);
    }

    public void printMultipleRandom(int howMany){

        while (howMany > 0){
            System.out.println("randomNum = " + random.nextInt());
            howMany--;
        }
    }

    public int throwDice(){

        int randomNum = random.nextInt(6);
        int diceValue;
        if(randomNum == 0){
            diceValue = randomNum + 1;
        }
        else{
            diceValue = randomNum;
        }
        return diceValue;
    }

    public String getResponse(){
        int randomNum = random.nextInt(2);
        String response;
        switch (randomNum){
            case 0:
                response = "No";
                break;
            case 1:
                response = "Yes";
                break;
            case 2:
                response = "Maybe";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomNum);
        }
        return response;
    }
}
