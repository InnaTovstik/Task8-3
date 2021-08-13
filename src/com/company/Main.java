package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Joker");
        list.add("Agat");
        list.add("Tom");
        list.add("Joker");
        list.add("Agat");
        System.out.println(list);
        System.out.println(uniqueSet1(list));
        System.out.println(list);
        System.out.println(uniqueSet2(list));
        System.out.println(list);
    }

    public static Set uniqueSet1(List list) {
        Set<String> hashSet = new HashSet<>();
        for (Object var : list) {
            hashSet.add((String) var);
        }
        return hashSet;
    }

    public static List uniqueSet2(List list) {
        List<String> list1 = new ArrayList<>();
        boolean flag = true;
        for (int j = 0; j < list.size(); j++) {
            String var = (String) list.get(j);
            if (flag) {
                list1.add(var);
            }
            for (int i = 0; i < list1.size(); i++) {
                    if (var.equals(list1.get(i))) {
                        flag = false;
                    }
                }
            }
       return list1;
    }
}
