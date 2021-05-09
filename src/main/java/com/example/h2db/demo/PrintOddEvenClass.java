package com.example.h2db.demo;

public class PrintOddEvenClass {

     int i=0;

    public static void main(String[] args) {

            PrintOddEvenClass printOddEvenClass=new PrintOddEvenClass();

            Thread t1= new Thread(() -> {
                try {
                    printOddEvenClass.printEven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            Thread t2= new Thread(() -> {
                try {
                    printOddEvenClass.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            t1.start();
            t2.start();
        }

    public synchronized void printOdd() throws InterruptedException {
        while(i<100) {
            if (i % 2 == 0) {
                wait();
            } else {
                System.out.println(i);
                i++;
            notify();
            }
        }
    }

    public  synchronized void printEven() throws InterruptedException {

        while(i<100) {
            if (i % 2 == 1) {
                wait();
            } else {
                System.out.println(i);
                i++;
            notify();
            }
        }
    }
    }
