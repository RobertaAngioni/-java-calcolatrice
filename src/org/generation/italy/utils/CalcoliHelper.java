package org.generation.italy.utils;

public class CalcoliHelper {
	
	private CalcoliHelper() {
		
	}
	
	// metodo per sommare due interi
	
	public static int intSum(int a, int b) {

		return a + b;
	}
	
	//metodo per sommare due numero double
	
	public static double doubleSum(double a, double b) {

		return a + b;
	}
	
	// metodo per calcolare differenza tra due numeri interi
	
	public static int intSub(int a, int b) {

		return a - b;
	}
	
	// metodo per calcolare differenza tra due numeri double
	
	public static double doubleSub(double a, double b) {

		return a - b;
	}
	
	// metodo per calcolare moltiplicazione fra due numeri interi
	public static int intMol(int a, int b) {

		return a * b;
	}
	
	// metodo per calcolare moltiplicazione tra due numeri double
	
	public static double doubleMol(double a, double b) {

		return a * b;
	}
	
	// metodo per calcolare valore assoluto di un numero intero
	
	public static int absoluteValueInt(int a) {
		if( a >= 0) {
			return a;
		} else
			return - a;
		
	}
	
	// metodo per calcolare valore assoluto di un numero double
	
		public static double absoluteValueDouble(double a) {
			if( a >= 0) {
				return a;
			} else
				return - a;
			
		}
		
	// medoto per calcolare minimo tra due numeri interi
		public static int minInt( int a, int b) {
//			return Math.min(a, b);
			if(a < b) {
				return a;
			}else
				return b;
			
		}
		
	// metodo per calcolare minimo tra due numeri double 	
		public static double minDouble( double a, double b) {
//			return Math.min(a, b);
			if(a < b) {
				return a;
			}else
				return b;
		}
		
	// medoto per calcolare massimo tra due numeri interi
		public static int maxInt( int a, int b) {
//			return Math.max(a, b);
			if(a > b) {
				return a;
			}else
				return b;
		}
				
	// metodo per calcolare massimo tra due numeri double 	
		public static double maxDouble( double a, double b) {
//			return Math.max(a, b);
			if(a > b) {
				return a;
			}else
				return b;
		}
		
		// metodo per calcolare elevamento a potenza

	    public static int power(int x, int y)
	    {
	        int result;
	        if (y == 0)
	            return 1;
	        result = power(x, y / 2);
	  
	        if (y % 2 == 0)
	            return result * result;
	        else {
	            if (y > 0)
	                return x * result * result;
	            else
	                return (result * result) / x;
	        }
	    }
 

}
