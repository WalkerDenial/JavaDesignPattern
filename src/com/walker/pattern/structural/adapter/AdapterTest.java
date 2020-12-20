package com.walker.pattern.structural.adapter;

import com.walker.pattern.structural.adapter.source.adapter.Adapter;
import com.walker.pattern.structural.adapter.source.adapter.LinuxAdapter;
import com.walker.pattern.structural.adapter.source.adapter.WindowAdapter;

public class AdapterTest {

    public static void main(String[] args) {
        Adapter adapter = new WindowAdapter();
        adapter.request();

        adapter = new LinuxAdapter();
        adapter.request();
    }

}
