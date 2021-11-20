class FizzBuzz
{
	public static void main(String[] args)
	{
		for(int i=1; i<=16; i++)
		{
			if(i%3==0 && i%5 ==0){
				System.out.print("FizzBuzz");
			}
			if(i%3==0){
				System.out.print("Fizz");
			}
			if(i%5==0){
				System.out.print("Buzz");
			}
			else{
				System.out.print(i);
			}
		}
		System.out.print("");
		System.out.print("git");
	}
}