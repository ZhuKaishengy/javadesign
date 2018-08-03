package com.aisino.adapter.objectmode;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Wrapper implements Targetable {

    private Source source;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method01() {
        source.method01();
    }

    @Override
    public void method02() {
        System.out.println("method02 ...");
    }
}
