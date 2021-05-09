package com.example.h2db.demo;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

import static java.lang.Thread.sleep;

public class ProducerConsumer {

    BlockingDeque bq= new LinkedBlockingDeque(2);

    int i;

    public static void main(String[] args) {

        ProducerConsumer printOddEvenClass=new ProducerConsumer();

        Thread t1= new Thread(() -> {
            try {
                printOddEvenClass.removeElement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2= new Thread(() -> {
            try {
                printOddEvenClass.addElement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }

    public void addElement() throws InterruptedException {
        synchronized (this) {
            while (i < 100) {
                sleep(500);
                if (bq.size()>=2) {
                    wait();
                } else {
                    bq.add(i++);
                    notify();
                }
            }
        }
    }

    public  void removeElement() throws InterruptedException {
        synchronized (this) {
            while (i < 100) {
                sleep(500);
                if (bq.size()<=0) {
                    wait();
                } else {
                    System.out.println(bq.poll());
                    notify();
                }
            }
        }
    }
}
