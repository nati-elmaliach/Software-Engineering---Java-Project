package tomer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	private String time;

	public Time() {
		time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
	
	public String getTime() {
		return time;
	}


}
