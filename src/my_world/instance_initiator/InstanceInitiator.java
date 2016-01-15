package my_world.instance_initiator;

/**
 * Created by root on 6/17/15.
 */

class IA{
    IA(){
        System.out.println("parent class constructor invoked");
    }
}

class InstanceInitiator extends IA {
    InstanceInitiator(){
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        InstanceInitiator b=new InstanceInitiator();
    }
}
/*
parent class constructor invoked
instance initializer block is invoked
child class constructor invoked
 */