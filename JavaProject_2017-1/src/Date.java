import java.text.SimpleDateFormat;

public class Date {
	Date now = new Date();
	void currentTime()
	{
		String Now1_string = now.toString();
	
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd월 hh시 mm분 ss초");
	
		String Now_string = simple.format(now);
	
		System.out.println(Now_string);
	}
}
