package my_world.reflection;

import java.lang.reflect.Method;

/**
 * Created by root on 7/16/15.
 */
class AppTest{

    private int counter;

    public void printIt(){
        System.out.println("printIt() no param");
    }

    public void printItString(String temp){
        System.out.println("printIt() with param String : " + temp);
    }

    public void printItInt(int temp){
        System.out.println("printIt() with param int : " + temp);
    }

    public void setCounter(int counter){
        this.counter = counter;
        System.out.println("setCounter() set counter to : " + counter);
    }

    public void printCounter(){
        System.out.println("printCounter() : " + this.counter);
    }
}
public class ReflectApp{

    public static void main(String[] args) {

        //no paramater
        Class noparams[] = {};

        //String parameter
        Class[] paramString = new Class[1];
        paramString[0] = String.class;

        //int parameter
        Class[] paramInt = new Class[1];
        paramInt[0] = Integer.TYPE;

        try{
            //load the AppTest at runtime
            Class cls = Class.forName("my_world.reflection.AppTest");
            Object obj = cls.newInstance();

            //call the printIt method
            Method method = cls.getDeclaredMethod("printIt", noparams);
            method.invoke(obj, null);

            //call the printItString method, pass a String param
            method = cls.getDeclaredMethod("printItString", paramString);
            method.invoke(obj, new String("mkyong"));

            //call the printItInt method, pass a int param
            method = cls.getDeclaredMethod("printItInt", paramInt);
            method.invoke(obj, 123);

            //call the setCounter method, pass a int param
            method = cls.getDeclaredMethod("setCounter", paramInt);
            method.invoke(obj, 999);

            //call the printCounter method
            method = cls.getDeclaredMethod("printCounter", noparams);
            method.invoke(obj, null);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

/*
REsult
printIt() no param
printIt() with param String : mkyong
printIt() with param int : 123
setCounter() set counter to : 999
printCounter() : 999
 */