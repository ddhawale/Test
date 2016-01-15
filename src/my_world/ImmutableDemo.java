package my_world;

import java.util.Date;

/**
 * Created by root on 6/16/15.
 */
final class ImmutableClass {

    private final String name;
    private final Integer age;
    private final Date date;

    public ImmutableClass(Integer age, String name , Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date)
    {
        return new ImmutableClass(fld1, fld2, date);
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Date getDate() {
        return this.date;
    }
    @Override
    public String toString() {
        return age +" - "+ name +" - "+ date;
    }
}
class A {
    Integer a;
    @Override
    public String toString() {
        return a + " ";
    }
}
public class ImmutableDemo {

    public static void main(String[] args)
    {
        ImmutableClass im = ImmutableClass.createNewInstance(100,"test", new Date());
        System.out.println(im);
    }
}