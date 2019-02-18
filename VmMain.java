package com.zdb.vm;


import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by zhangdebin on 2019/2/14.
 */
public class VmMain {

//    public static void main(String[] args) {
//        List<UserBean> users = new ArrayList<>();
//        while (true) {
//            users.add(new UserBean());
//        }
//    }



//    public static void main(String[] args) {
//        Recursion recursion = new Recursion();
//        try {
//            recursion.recursionself();
//        } catch (Throwable e) {
//            System.out.println("current value :" + recursion.currentValue);
//            throw e;
//        }
//    }



    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalArgumentException,
            IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }

    }
}
