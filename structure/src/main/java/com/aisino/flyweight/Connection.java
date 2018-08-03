package com.aisino.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
class Connection implements Serializable{

    private String url;
    private String driverClass;
    private String username;
    private String password;
}
