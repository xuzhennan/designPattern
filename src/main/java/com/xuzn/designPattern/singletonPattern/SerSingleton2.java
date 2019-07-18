package com.xuzn.designPattern.singletonPattern;

import java.io.*;

public class SerSingleton2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private static SerSingleton2 instance = new SerSingleton2();

    private SerSingleton2() {
    }

    public static SerSingleton2 getInstance() {
        return instance;
    }

    /**
     * 防止序列化破化单例模式
     *
     * @return
     */
    private Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerSingleton2 s1 = null;
        SerSingleton2 s = SerSingleton2.getInstance();

        FileOutputStream fos = new FileOutputStream("SerSingleton2.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("SerSingleton2.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (SerSingleton2) ois.readObject();
        System.out.println(s == s1); //false 单例模式被破坏
    }
}
