package org.quetzacode.techtalk.concurrency.basics;

public class CreateThread3 implements Runnable {
    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String ... args){
        new Thread(new CreateThread3()).start();
    }
}
