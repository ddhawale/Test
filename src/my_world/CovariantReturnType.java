package my_world;

/**
 * Created by root on 6/16/15.
 */
class CovariantReturnType{

    public static void main(String args[]){
        A1 a = new B1();
        a.get().message();
    }
}

class A1 {
    A1 get() {
        return this;
    }
    void message() {
        System.out.println("welcome to covariant return type A");
    }
}

class B1 extends A1{
    B1 get() {
        return this;
    }
    void message() {
        System.out.println("welcome to covariant return type B");
    }
}

/*
* Result :
* welcome to covariant return type B
* */
