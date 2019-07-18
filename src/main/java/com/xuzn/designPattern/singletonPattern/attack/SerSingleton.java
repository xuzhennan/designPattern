package com.xuzn.designPattern.singletonPattern.attack;

import java.io.*;

public class SerSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private static SerSingleton instance = new SerSingleton();

    private SerSingleton() {
    }

    public static SerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerSingleton s1 = null;
        SerSingleton s = SerSingleton.getInstance();

        FileOutputStream fos = new FileOutputStream("SerSingleton2.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("SerSingleton2.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (SerSingleton) ois.readObject();
        System.out.println(s == s1); //false 单例模式被破坏
    }
}
