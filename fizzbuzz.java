public class fizzbuzz
{

    
    
    public void run() {
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String str = "";
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 2)
                System.out.print(Fizz);              
            if (i == 4)
                System.out.print(Buzz);
            if (i == 5)
                System.out.print(Fizz);
            if (i == 8)
                System.out.print(Fizz);
            if (i == 9)
                System.out.print(Buzz);
            if (i == 11) 
                System.out.print(Fizz);
        }
    }
    
    
    public static void main(String[] args)
    {        
        fizzbuzz fb = new fizzbuzz();
        fb.run();
    }
}
