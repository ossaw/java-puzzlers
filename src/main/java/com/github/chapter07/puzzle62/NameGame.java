package com.github.chapter07.puzzle62;

import java.util.IdentityHashMap;
import java.util.Map;

public class NameGame {
    public static void main(String args[]) {
        Map<String, String> m = new IdentityHashMap<String, String>();
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
        System.out.println(m.size());
    }
}
