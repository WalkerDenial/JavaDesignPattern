package com.walker.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:16.
 */
public class Composite extends Component {

    private List<Component> mList = new ArrayList<>();

    @Override
    void operation() {

    }

    public void add(Component c) {

    }

    public void remove(Component c) {

    }

    public Component getChild(int i) {
        if (mList != null && mList.size() > i) {
            return mList.get(i);
        }
        return null;
    }

}
