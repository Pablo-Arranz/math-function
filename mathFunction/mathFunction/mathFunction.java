package mathFunction;

public class mathFunction {

	    public static void main(String[] args) {
	        int number1 = 1;
	        int number2 = 2;
	        int number3 = 3;
	        
	        if (number1+number2==number3) {
	            if ((number1+number2==number3)&&(number1-number2==number3)&&(number1*number2==number3)) {
	                System.out.println("+-*");
	            } else if (number1*number2==number3) {
	            	System.out.println("+*");
	            }
	            else {
	            	System.out.println("+");
	            }
	        }   else if (number1-number2==number3) {
	                if (number1/number2==number3) {
	                    System.out.println("-/");
	                } else System.out.println("-");
	        }   else if (number1*number2==number3) {
	                System.out.println("*");
	        }   else if (number1/number2==number3) {
	                System.out.println("/");
	        }   else {
	                System.out.println("None");
	        }
	}
	}