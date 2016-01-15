package my_world;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by root on 7/20/15.
 */
class TestIt {
    static void change() {
        System.out.println("You can change me");
    }
}


public class ChangeIt {

  public static void main(String args[]) {
      Set<String> a = new HashSet<String>();
    int arr[] = {1,2};
    print(arr);
    change(arr);
    print(arr);
    makeNull(arr);
    print(arr);
      TestIt t = null;
      t.change();
      print(arr);
  }

  static void change(int []arr) {
    arr[1] = 10;
  }

  static void makeNull(int []arr) {
    arr = null;
  }

  static void print(int []arr) {
    for (int i =0 ; i < arr.length ; i++) {
      System.out.println(arr[i] + " ");
    }
  }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

/*
n that's why Java is call by value -- u can update value of argument Object but you can not change it's reference..
 */