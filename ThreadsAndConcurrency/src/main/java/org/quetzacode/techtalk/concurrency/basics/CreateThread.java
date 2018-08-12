package org.quetzacode.techtalk.concurrency.basics;

public class CreateThread extends Thread{
    public static void main (String ... args){
        CreateThread ct=new CreateThread();
        ct.run();
    }

    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
