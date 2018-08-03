package com.aisino.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

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
abstract class AbstractUser {

    private Mediator mediator;

    /**
     * 中要做的事儿
     */
    abstract void work();
}
