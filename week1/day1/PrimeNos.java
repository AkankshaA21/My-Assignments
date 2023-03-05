package week1.day1;

public class PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = 100;
		for(int num =1; num <=100; num++) {
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	     
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		}
		}  
	}


