package chapterfive.exercises;

public class SwapNumbers {

    public String swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;

        return "Swapped: " + a + " " + b;
    }
}
