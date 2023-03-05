package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
  int n=11,firstNum=0,secNum=1;
  System.out.println("Fibonacci Series till" + n + " numbers: ");
  for (int i = 1; i <= n; ++i) {
	  System.out.print(firstNum + " ");
	// compute the nextNum
      int nextNum = firstNum + secNum;
      firstNum = secNum;
      secNum = nextNum;
  }
  

}
}
