// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String input = args[0]; 
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        String period;
		if (hours >= 12) {
			period = "PM" ; 
		} else {
			period = "AM" ; 
		}
		if (hours > 12) {
			hours = hours - 12; 
			System.out.print(hours);
		} else {
			System.out.print(hours);
	}
	if (minutes <10) {
		System.out.print(":0"+minutes);
		
	} else {
		System.out.print(":"+ minutes);	
	}
	System.out.print(" " + period);
	
}
}