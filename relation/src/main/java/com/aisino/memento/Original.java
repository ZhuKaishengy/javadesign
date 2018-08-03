package com.aisino.memento;

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
class Original {

    private String name;

    Memento createMemento(){
        return new Memento(this.name);
    }

    void restore(Memento memento){
        this.setName(memento.getValue());
    }

}
