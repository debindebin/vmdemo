package com.zdb.vm;

/**
 * Created by zhangdebin on 2019/2/14.
 */
public class Recursion {
    public int currentValue = 0;

    public void recursionself() {
        currentValue += 1;
        recursionself();
    }
}
