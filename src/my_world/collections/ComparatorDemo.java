package my_world.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by root on 6/30/15.
 */
public class ComparatorDemo {

    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(new Student1(101,"Vijay",23));
        al.add(new Student1(106,"Ajay",27));
        al.add(new Student1(105,"Jai",21));

        System.out.println("Sorting by Name...");

        Collections.sort(al, new NameComparator());
        System.out.println(al);

        System.out.println("sorting by age...");

        Collections.sort(al,new AgeComparator());
        System.out.println(al);
    }
}

class Student1 {
    int rollno;
    String name;
    int age;

    Student1(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return this.rollno+" "+this.name+" "+this.age;
    }
}

class AgeComparator implements Comparator {
    @Override
    public int compare(Object o1,Object o2){
        Student1 s1=(Student1)o1;
        Student1 s2=(Student1)o2;

        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparator implements Comparator<Student1>{
    @Override
    public int compare(Student1 s1,Student1 s2){
        return s1.name.compareTo(s2.name);
    }

}

/*
Sorting by Name...
[106 Ajay 27, 105 Jai 21, 101 Vijay 23]
sorting by age...
[105 Jai 21, 101 Vijay 23, 106 Ajay 27]
 */