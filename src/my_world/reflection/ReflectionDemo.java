package my_world.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by root on 7/10/15.
 */
public class ReflectionDemo {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InterruptedException, InstantiationException {
        Class myObjectClass = Reflect.class;
        Object object = myObjectClass.newInstance();
        Method[] methods = myObjectClass.getMethods();

        for(Method m :methods) {
            System.out.println(m.getName());
        }
        Thread.sleep(10);
        System.out.println("=============================");
        Method method = myObjectClass.getDeclaredMethod("print");
        method.setAccessible(true);
        System.out.println(method.getName());
        method.invoke(object);
    }
}

class Reflect {
    private int myInt;
    int myInt1;

    Reflect() {
        this.myInt = 0;
        this.myInt1 = 0;
    }

    Reflect(int myInt, int myInt1) {
        this.myInt = myInt;
        this.myInt1 = myInt1;
    }

    public int getMyInt1() {
        return myInt1;
    }

    public void setMyInt1(int myInt1) {
        this.myInt1 = myInt1;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void print() {
        System.out.println(myInt + "\t " + myInt1);
    }
}
/*
Result

getMyInt1
setMyInt1
getMyInt
setMyInt
print
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll
=============================
print
0	 0
 */
