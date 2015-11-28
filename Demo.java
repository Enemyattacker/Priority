package ru.stetsenko;

/**
 * Created by Alesha on 28.11.2015.
 */
public class Demo extends Thread {

    public int count;
    public synchronized void increment(String name){
        count++;
        System.out.println(name+count);
    }

    public void run() {
        for (int j = 0; j < 30; j++) {
            increment(getName());
        }
    }

}
