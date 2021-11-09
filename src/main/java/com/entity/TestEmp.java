package com.entity;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmp {

    public static void main(String[] args) {
        Map<Emp ,String > map = new HashMap<>();

        Emp e1 = new Emp(12, "ravi",100);
        Emp e2 = new Emp(11, "ram",200);
        Emp e3 = new Emp(8, "ravi",200);
        Emp e4 = new Emp(90, "ashu",300);
        Emp e5 = new Emp(2, "ravi", 400);
        Emp e6 = new Emp(1, "ashu", 500);
        Emp e7 = new Emp(3, "ram", 600);

        List<Emp> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);

        /*Comparator<Emp> com = new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getId() - o1.getId();
            }
        };

        Collections.sort(list, com);
      list.stream().forEach(System.out::println);*/

        Map<String, Double> map1= list.stream()
                .collect(Collectors.groupingBy(em -> em.getName(), Collectors.summingDouble(e -> e.getSalary())));

        Map<String, List<Emp>> map2= list.stream()
                .filter(e -> e.getName().startsWith("r"))
                .filter(e -> e.getId() >3)
                .collect(Collectors.groupingBy(em -> em.getName()));

        for (Map.Entry ent: map2.entrySet() ) {

            System.out.println(ent.getKey() +" "+ent.getValue());

        }

        list.stream().forEach(e -> e.setId(10));
        list.stream().forEach(System.out::println);


    }
}
