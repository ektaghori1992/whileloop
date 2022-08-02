package Whileloop;

public class tenoddeven
{
    public static void main(String[] args)
    {
        int a = 1;
        while (a <= 20)
        {
            if(a%2==0)
            {
                System.out.println(a);
            }
            a++;
        }
        int b=1;
        while(b<=20)
        {
            if(b%2==1)
            {
                System.out.println(b);

            }
            b++;
        }
    }
}