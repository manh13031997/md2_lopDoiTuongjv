package XDstopwatch;

import java.util.Arrays;
import java.util.Scanner;

public class Stopwatch1 {
    public static void main(String[] args) {
        Stopwatch stopwatch=new Stopwatch();
        int[] array=new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random()*1000);
        }
        stopwatch.start();
        System.out.println(Arrays.toString(array));
        stopwatch.stop();
        System.out.println(stopwatch.getElapsedTime());
    }
}
