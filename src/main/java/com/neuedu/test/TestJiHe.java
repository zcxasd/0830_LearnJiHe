package com.neuedu.test;

import java.util.*;

public class TestJiHe {
    public static void main(String[] args) {
        sort03();
    }
    // 冒泡算法（从小到大）
    public static void sort(){
        int a[] = {2,5,4,9,8,7,};
        int temp = 0;
        for (int m=0; m<a.length; m++){
            for (int n=0; n<a.length-1; n++){
                if (a[n]>a[n+1]){
                    temp=a[n];
                    a[n]=a[n+1];
                    a[n+1]=temp;
                }
            }
        }
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+"  ");
        }
    }
    // set和list
    public static void sort01(){
        //List<Integer> list = new ArrayList<>();
        Set<Integer> list = new HashSet<>();
        list.add(5);
        list.add(8);
        list.add(6);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.print(o+"  ");
        }
    }
    // map
    public static void sort02(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王武");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> o = iterator.next();
            System.out.println(o.getKey()+" "+o.getValue());
        }
    }
    // 冒泡排序 Person ps[],按照年龄有大到小输出
    public static void sort03(){
        Person ps[] = new Person[4];
        ps[0]=new Person("张三",18);
        ps[1]=new Person("李四",20);
        ps[2]=new Person("王武",19);
        ps[3]=new Person("赵柳",25);
        Person temp = null;
        for (int m=0; m<ps.length; m++){
            for (int n=0; n<ps.length-1; n++){
                if (ps[n].getAge()<ps[n+1].getAge()){
                   temp=ps[n];
                   ps[n]=ps[n+1];
                   ps[n+1]=temp;
                }
            }
        }
        for (int i=0; i<ps.length; i++){
            System.out.println(ps[i]);
        }
    }
}
class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.getAge();
    }
}