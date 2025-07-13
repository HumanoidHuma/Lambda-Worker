import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
    }
}