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
        list.add("Joker");
        list.add("Agat");
        list.add("Tom");
        System.out.println("Список строк " + list);
        System.out.println("Cписок из уникальных значений (с использованием Set) " + uniqueSet(list));
        System.out.println("Cписок из уникальных значений (без использования Set) " + uniqueList(list));
    }

    public static Set<String> uniqueSet(List<String> list) {
        return new HashSet<>(list);
    }

    public static List<String> uniqueList( List<String> list) {
        List<String> uniquelist = new ArrayList<>();
        for (String o : list) {
            if (!uniquelist.contains(o)) {
                uniquelist.add(o);
            }
         }
        return  uniquelist;
    }
}