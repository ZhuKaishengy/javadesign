package com.aisino.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
class State {

    private String stateVal;

    void method1(){
        System.out.println("method1 ...");
    }

    void method2(){
        System.out.println("method2 ...");
    }
}
