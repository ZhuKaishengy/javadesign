package com.aisino.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Objects;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
class Command {

    private static final String FIRST_METHOD = "first";
    private State state;

    void method(){
        if (Objects.equals(FIRST_METHOD,this.state.getStateVal())) {
            state.method1();
            return;
        }
        state.method2();
    }
}
