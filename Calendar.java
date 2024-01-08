public class Calendar{	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Runs over the days until a day before the wanted year
		int wantedYear = Integer.parseInt(args[0]);
		while(year < wantedYear){
			month = 1;
			while(month < 13){
				dayOfMonth = 1;
				while(dayOfMonth <= nDaysInMonth(month, year)){
					if(dayOfWeek == 7){
						dayOfWeek = 1;
					}
					else{
						dayOfWeek++;
					}
					dayOfMonth++;
				}
				month++;
			}
			year++;
		}
		//Prints the calendar of the wanted year
		while(year < wantedYear + 1){
			month = 1;
			while(month < 13){
				dayOfMonth = 1;
				while(dayOfMonth <= nDaysInMonth(month, year)){
					if(dayOfWeek == 1){
						System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
					}
					else{
						System.out.println(dayOfMonth + "/" + month + "/" + year);
					}
					if(dayOfWeek == 7){
						dayOfWeek = 1;
					}
					else{
						dayOfWeek++;
					}
					dayOfMonth++;
				}
				month++;
			}
			year++;
		}
		
	 } 
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		int counter = 0; // Counts the Sundays that are first day of the month
		while(year < 2000){
			month = 1;
			while(month < 13){
				dayOfMonth = 1;
				while(dayOfMonth <= nDaysInMonth(month, year)){
					if(dayOfWeek == 1){
						System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
						if(dayOfWeek == dayOfMonth){
							counter++;
						}
					}
					else{
						System.out.println(dayOfMonth + "/" + month + "/" + year);
					}
					if(dayOfWeek == 7){
						dayOfWeek = 1;
					}
					else{
						dayOfWeek++;
					}
					dayOfMonth++;
				}
				month++;
			}
			year++;
		}
	 } 
		 
    
	private static boolean isLeapYear(int year) {
	    boolean isLeapYear = ((year % 400) == 0);
	    isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
	}
	 
	
	private static int nDaysInMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			return 31;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		else{
			if (isLeapYear(year) == true)return 29;
			else return 28;
		}
	}
}