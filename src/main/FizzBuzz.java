package main;

public class FizzBuzz {

	

   public void DoFizzBuzz() {
    for (int i=1; i<=100; i++) 
    { 
        // number divisible by 3 and 5 will 
        // always be divisible by 15, print  
        // 'FizzBuzz' in place of the number 
        if (i%15 == 0)         
            System.out.println("FizzBuzz\t");     
          
        // number divisible by 3? print 'Fizz' 
        // in place of the number 
        else if ((i%3) == 0)     
        	System.out.println("Fizz\t");                  
          
        // number divisible by 5, print 'Buzz'   
        // in place of the number 
        else if ((i%5) == 0)                        
        	System.out.println("Buzz\t");                  
      
        else // print the number             
        	System.out.println("neither: " + i);                  
  
    }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.DoFizzBuzz();

	}

}
