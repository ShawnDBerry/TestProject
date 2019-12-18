package testCodeClasses;

public class FizzBuzz {

	

   public void DoFizzBuzz(int num) {
     
    
        // number divisible by 3 and 5 print 
        // 'FizzBuzz' in place of the number 
        if (num % 5 == 0 && num % 3 == 0)         
            System.out.println("FizzBuzz\t");     
          
        // number divisible by 3? print 'Fizz'
        // in place of the number 
        else if (num % 5 == 0)     
        	System.out.println("Fizz\t");                  
          
        // number divisible by 5, print 'Buzz'   
        // in place of the number 
        else if (num % 3 == 0)                        
        	System.out.println("Buzz\t");                  
      
        else // print the number             
        	System.out.println("neither: " + num);                  
  
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.DoFizzBuzz(30);
		fizzbuzz.DoFizzBuzz(8);
		fizzbuzz.DoFizzBuzz(10);
		fizzbuzz.DoFizzBuzz(6);
		fizzbuzz.DoFizzBuzz(45);
		fizzbuzz.DoFizzBuzz(52);
		

	}

}
