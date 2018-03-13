package com.aisino.adapter.ObjectMode;

import java.awt.*;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Wrapper(Source source) {
        this.source = source;
    }

    public void method01() {
        source.method01();
    }

    public void method02() {
        System.out.println("method02 ...");
    }
}
