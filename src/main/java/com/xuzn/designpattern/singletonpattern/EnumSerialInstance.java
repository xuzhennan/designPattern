package com.xuzn.designpattern.singletonpattern;

import java.io.*;

/**
 * 总结，实现单例模式的唯一推荐方法，使用枚举类来实现。
 * 使用枚举类实现单例模式，在对枚举类进行序列化时，还不需要添加readRsolve方法就可以避免单例模式被破坏。
 */
public enum EnumSerialInstance implements Serializable {

    INSTANCE;

    private static final long serialVersionUID = 1L;


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSerialInstance s1 = null;
        EnumSerialInstance s = EnumSerialInstance.INSTANCE;

        FileOutputStream fos = new FileOutputStream("EnumSerialInstance.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("EnumSerialInstance.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (EnumSerialInstance) ois.readObject();
        System.out.println(s == s1); //false 单例模式被破坏
    }

}
