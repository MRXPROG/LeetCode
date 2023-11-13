package com.example.LeetCode;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton(){};

    private static final Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
    private Object readResolve(){
        return singleton;
    }
}

class LazySingleton {

    private LazySingleton() {
    }
    private static LazySingleton singleton;

    public LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}

class SynchronizedSingleton {

    private SynchronizedSingleton() {
    }

    private static SynchronizedSingleton singleton;

    public synchronized SynchronizedSingleton getSingleton() {
        if (singleton == null) {
            singleton = new SynchronizedSingleton();
        }
        return singleton;
    }
}

class DoubleLazySynchronizedSingleton {

    private DoubleLazySynchronizedSingleton() {
    }

    private volatile static DoubleLazySynchronizedSingleton singleton;

    public synchronized DoubleLazySynchronizedSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleLazySynchronizedSingleton.class){
                if(singleton == null){
                    singleton = new DoubleLazySynchronizedSingleton();
                }
            }
        }
        return singleton;
    }
}

class BillPughSingleton{
    private BillPughSingleton(){}

    private static class Helper{
        private static BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    public BillPughSingleton getInstance(){
        return Helper.billPughSingleton;
    }

}

enum EnumSingleton{
    INSTANCE;
    public static void DoJob(){}
    private int data; // Пример поля

    // Пример метода для установки значения data
    public void setData(int data) {
        this.data = data;
    }

    // Пример метода для получения значения data
    public int getData() {
        return data;
    }
}
