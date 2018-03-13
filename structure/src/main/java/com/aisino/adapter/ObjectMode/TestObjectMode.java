package com.aisino.adapter.ObjectMode;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestObjectMode {

    @Test
    public void test01(){
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method01();
        wrapper.method02();
    }
}
