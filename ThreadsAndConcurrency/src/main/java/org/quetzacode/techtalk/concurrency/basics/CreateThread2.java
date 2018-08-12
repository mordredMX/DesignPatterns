package org.quetzacode.techtalk.concurrency.basics;

public class CreateThread2 {
    public static void main (String ... args){
        new Thread(() -> {
            for(int i=0; i<10; i++)
                System.out.println(i);
        }).start();

        new Thread(){
            @Override
            public void run(){
                for(int i=10; i>0; i--)
                    System.out.println(i);
            }
        }.start();
    }
}
