package com.walker.pattern.structural.adapter.source.adapter;

import com.walker.pattern.structural.adapter.source.target.LinuxTarget;
import com.walker.pattern.structural.adapter.source.target.Target;

public class LinuxAdapter extends Adapter{

    @Override
    Target bindTarget() {
        return new LinuxTarget();
    }

}
