import java.util.Scanner;
public class Schedule {
	private int year;
	private int month;
	private int day;
	private String memo;
	
	public void AddSchedule()
	{
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("일정의 년도를 입력하세요 : ");
		year = scan.nextInt();
		System.out.println("일정의 월을 입력하세요 : ");
		month = scan.nextInt();
		System.out.println("일정의 날을 입력하세요 : ");
		day = scan.nextInt();
		
		System.out.println("일정을 적어주세요");
		memo = scan1.nextLine();
		
	}
	public void AddScheduleTest()
	{
		System.out.println(year+"년"+month+"월"+day+"일의 일정은");
		System.out.println(memo);
	}
}
