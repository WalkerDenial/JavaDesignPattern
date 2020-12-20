package com.walker.pattern.structural.adapter.source.adapter;

import com.walker.pattern.structural.adapter.source.target.Target;
import com.walker.pattern.structural.adapter.source.target.WindowTarget;

public class WindowAdapter extends Adapter{

    @Override
    Target bindTarget() {
        return new WindowTarget();
    }

}
