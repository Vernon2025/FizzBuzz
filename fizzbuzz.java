public class fizzbuzz
{

    
    
    public void run() {
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String FizzBuzz = "FizzBuzz";
        String str = "";
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
    
    
    public static void main(String[] args)
    {        
        fizzbuzz fb = new fizzbuzz();
        fb.run();
    }
}
