package com.slinn.module.suppersupport;

import com.orhanobut.logger.PrettyFormatStrategy;

public class Hello {

    public static void init() {
        L.init(null);
    }

    public static void sayHi() {
        L.i("Hi!");
        L.i("Hi!%s%s!", "您", "好");
        L.t("fanlin").i("Hi!");
        L.addLogAdapter(PrettyFormatStrategy.newBuilder().build());
        L.d(null);
        L.d("Hi!%s%s!", "您", "好");
        L.clear();
        L.addLogAdapter(PrettyFormatStrategy.newBuilder().tag("fanlin").build());
        L.json("{\"items\":[{\"name\":\"\\u539f\\u5473\\u53d1\\u9175\\u4e73180\",\"barcode\":\"6952522800047\",\"price\":null,\"sale_price\":\"3.00\",\"quantity\":\"1\",\"amount\":\"3.00\"},{\"name\":\"\\u519c\\u592b\\u5c71\\u6cc9\\u5929\\u7136\\u6c34\",\"barcode\":\"6921168511280\",\"price\":null,\"sale_price\":\"3.00\",\"quantity\":\"1\",\"amount\":\"3.00\"}],\"total_amount\":\"6.00\",\"promote_amount\":\"6.00\",\"actual_amount\":\"0.00\"}");
    }
}
