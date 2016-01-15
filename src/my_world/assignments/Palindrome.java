package my_world.assignments;
import java.io.*;
class number{
    private int num;
    public void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no");
        String s1=br.readLine();
        num=Integer.parseInt(s1);
    }

    public void check()
    {

        int rem;
        int palin=num;
        int reverse=0;
        while(palin!=0)
        {
            rem=palin%10;
            reverse=reverse*10+rem;
            palin=palin/10;
        }
        if(num==reverse)
            System.out.println("no. is palindrom");
        else
            System.out.println("no.is not palindrom");

    }

}
class Palindrome
{
    public static void main(String args[])throws IOException
    {
        number n=new number();
        n.accept();
        n.check();
    }
}