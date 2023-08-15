package XDstopwatch;

public class Stopwatch {
    long startTime;
    long endTime;
    public Stopwatch(){
    }
    public long  getElapsedTime(){
        return endTime - startTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime =  System.currentTimeMillis();
    }
}
