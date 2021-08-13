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
        System.out.println("Список строк " + list);
        System.out.println("Cписок из уникальных значений (с использованием Set) " + uniqueSet(list));
        System.out.println("Cписок из уникальных значений (без использования Set) " + uniqueList(list));
    }

    public static Set uniqueSet(List list) {
        Set<String> hashSet = new HashSet<>();
        for (Object var : list) {
            hashSet.add((String) var);
        }
        return hashSet;
    }

    public static List uniqueList(List list) {
        List<String> uniquelist = new ArrayList<>();
        String elem = (String) list.get(0);
        uniquelist.add(elem);
        for (int i = 1; i < list.size(); i++) {
            boolean flag = false;
            elem = (String) list.get(i);
            for (String s : uniquelist) {
                flag = elem.equals(s);
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                uniquelist.add(elem);
            }
        }
        return uniquelist;
    }
}