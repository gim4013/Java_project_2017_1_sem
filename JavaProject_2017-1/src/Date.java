import java.text.SimpleDateFormat;

public class Date {
	Date now = new Date();
	void currentTime()
	{
		String Now1_string = now.toString();
	
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
	
		String Now_string = simple.format(now);
	
		System.out.println(Now_string);
	}
}
