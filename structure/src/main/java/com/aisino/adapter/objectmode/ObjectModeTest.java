package com.aisino.adapter.objectmode;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class ObjectModeTest {

    @Test
    public void test01(){
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method01();
        wrapper.method02();
    }
}
