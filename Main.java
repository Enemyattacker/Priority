package ru.stetsenko;

/**
 * Created by Alesha on 28.11.2015.
 */
public class Main {
    public static void main(String args[]) {
        Demo thread = new Demo();
        thread.setName("Поток с нормальным приоритетом ");

        Demo anotherThread = new Demo();
        anotherThread.setName("Поток с максимальным приоритетом ");

        thread.setPriority(Thread.NORM_PRIORITY);
        anotherThread.setPriority(Thread.MAX_PRIORITY);

        thread.start();
        anotherThread.start();

    }
}
