package com.walker.pattern.creational.prototype;

import com.walker.pattern.creational.prototype.source.FAR;
import com.walker.pattern.creational.prototype.source.OfficialDocument;
import com.walker.pattern.creational.prototype.source.PrototypeManager;
import com.walker.pattern.creational.prototype.source.SRS;

public class PrototypeTest {

    public static final String FAR = "FAR";
    public static final String SRS = "SRS";

    public static void main(String[] args) {
        // 初始化数据
        PrototypeManager manager = PrototypeManager.getInstance();
        manager.addOfficialDocument(FAR, new FAR());
        manager.addOfficialDocument(SRS, new SRS());

        // 获取 FAR 文档对象
        OfficialDocument far = manager.getOfficialDocument(FAR);
        far.display(); // type is  --> 0.5372520402277561

        // clone FAR 文档对象
        OfficialDocument far2 = far.clone();
        far2.display(); // type is  --> 0.5372520402277561

        System.out.println(far.hashCode() == far2.hashCode()); // false
    }

}
