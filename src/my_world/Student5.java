package my_world;

/**
 * Created by root on 6/15/15.
 */
public class Student5 {
    int data=10;
    Student5(){
        B b=new B(this);
        b.display();
    }
    public static void main(String args[]){
        Student5 a=new Student5();
    }
}

class B{
    Student5 obj;
    B(Student5 obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);
    }
}
/*
* Result :
* 10
* */
