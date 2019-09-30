package collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.velocity.runtime.directive.Parse;

public class PlayWithDates {

	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDate= new SimpleDateFormat("dd/mm/yyyy");
		Date date1= simpleDate.parse("31/10/2019");
		
		System.out.println("Date1 is: "+simpleDate.format(date1));
	}
	
}
