import java.util.Scanner;

public class question_7 {
	public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        boolean leapYear = true;
        String monthName = null;
        System.out.print("Enter Year: ");
        int year = cin.nextInt();
        System.out.print("Enter Month Number: ");
        int month = cin.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        	
        	switch (month) {
        	case 1:
        		monthName = "January";
        		break;
        	case 2:
        		monthName = "February";
        		break;
        	case 3:
        		monthName = "March";
        		break;
        	case 4:
        		monthName = "April";
        		break;
        	case 5:
        		monthName = "May";
        		break;
        	case 6:
        		monthName = "June";
        		break;
        	case 7:
        		monthName = "July";
        		break;
        	case 8:
        		monthName = "August";
        		break;
        	case 9:
        		monthName = "September";
        		break;
        	case 10:
        		monthName = "October";
        		break;
        	case 11:
        		monthName = "November";
        		break;
        	case 12:
        		monthName = "December";
        		break;
        	}
        	
        	
        	switch(month) {
        	case 2:
        		if(leapYear == true) {
        			System.out.println("There are 29 days in " + monthName + " of " + year + ".");
        			break;
        		}
        		else {
        			System.out.println("There are 28 days in " + monthName + " of " + year + ".");
        			break;
        		}
        	case 4:
        	case 6:
        	case 9:
        	case 11:
        		System.out.println("There are 30 days in " + monthName + " of " + year + ".");
        		break;
        	default:
        		System.out.println("There are 31 days in " + monthName + " of " + year + ".");
        		break;
        	}
        	cin.close();
    }
}