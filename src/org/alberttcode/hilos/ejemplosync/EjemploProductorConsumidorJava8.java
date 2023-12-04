package org.alberttcode.hilos.ejemplosync;

import org.alberttcode.hilos.ejemplos.runnable.Consumidor;
import org.alberttcode.hilos.ejemplos.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(()->{
            for (int i = 0; i<=10; i++){
                p.hornear("Pan n° " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            for(int i = 0; i<=10; i++){
                p.consumir();
            }
        }).start();
    }
}
