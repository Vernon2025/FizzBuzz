public class fizzbuzz
{
    public void run() {
        int fizz = 3;  
        int buzz = 5;  
        int fizzbuzz = 15; 
        boolean isFizz;
        boolean isBuzz;
        boolean isFizzBuzz;
        for (int i = 1; i <= 100; i++) {
            isFizz = false;
            isBuzz = false;
            isFizzBuzz = false;
            

            if (i == fizz) {       
                isFizz = true;      
                fizz += 3;           
            }
            if (i == buzz) {
                isBuzz = true;
                buzz += 5;
            }
            if (i == fizzbuzz) {
                isFizzBuzz = true;
                fizzbuzz += 15;
            }
            
             
            if (isFizz && !isFizzBuzz) {
                System.out.println("Fizz");
            } else if (isBuzz && !isFizzBuzz) {
                System.out.println("Buzz");
            } else if (isFizzBuzz) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {        
        fizzbuzz fb = new fizzbuzz();
        fb.run();
    }
}
