package Assignment2;
//prime numbers between 1 to 50
public class PrimeNumber {

	public static void main(String[] args) 
	{
		System.out.println("The prime numbers are:");
		
        for(int num=1; num<=50; num++)
			
		 {
        	 
			boolean isprime=true;
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			}
			
			if(isprime==true)
			{
				System.out.println(num);
			
			}
			
		}
         
        
	}
}


		
	
		
			

		
		

	


