package chapterfive.exercises;

public class RandomTest {

    public static void main(String[] args) {
        RandomEx randomEx = new RandomEx();
        int x = 25;
        while ( x > 0) {
            System.out.println(randomEx.throwDice());
            x--;
        }
    }
}
