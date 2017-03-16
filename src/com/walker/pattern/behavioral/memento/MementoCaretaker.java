package com.walker.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 13:35.
 */
public class MementoCaretaker {

    private List<ChessmanMemento> list = new ArrayList();

    public ChessmanMemento getMemento(int i){
        return list.get(i);
    }

    public void setMemento(ChessmanMemento memento){
        list.add(memento);
    }

}
