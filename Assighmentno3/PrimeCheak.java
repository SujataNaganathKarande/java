package Assighmentno3;

public class PrimeCheak {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner();
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        try {
	            if (num == 0) {
	                throw new ZeroNumberException("Number is 0");
	            }

	            // Prime check logic
	            boolean isPrime = true;
	            if (num < 2) {
	                isPrime = false;
	            } else {
	                for (int i = 2; i <= Math.sqrt(num); i++) {
	                    if (num % i == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }
	            }

	            if (isPrime) {
	                System.out.println(num + " is a prime number.");
	            } else {
	                System.out.println(num + " is not a prime number.");
	            }

	        } catch (ZeroNumberException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}

