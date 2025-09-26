package Assighmentno3;

public class MyDate {
	
	    private int day, month, year;

	    // Method to accept date
	    public void acceptDate(int day, int month, int year) throws InvalidDateException {
	        if (!isValidDate(day, month, year)) {
	            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
	        }
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    // Method to display date
	    public void displayDate() {
	        System.out.println("Date: " + day + "/" + month + "/" + year);
	    }

	    // Static method to validate date
	    private static boolean isValidDate(int day, int month, int year) {
	        if (month < 1 || month > 12 || day < 1) {
	            return false;
	        }

	        // Days in each month
	        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	        // Check for leap year
	        if (month == 2 && isLeapYear(year)) {
	            daysInMonth[1] = 29;
	        }

	        return day <= daysInMonth[month - 1];
	    }

	    // Method to check if a year is a leap year
	    private static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }
	}

	// Main class to test the functionality
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        MyDate date = new MyDate();

	        try {
	            System.out.print("Enter day: ");
	           int day = scanner.nextInt();
	            System.out.print("Enter month: ");
	            int month = scanner.nextInt();
	            System.out.print("Enter year: ");
	            int year = scanner.nextInt();

	            date.acceptDate(day, month, year);
	            date.displayDate();
	        } catch (InvalidDateException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}


