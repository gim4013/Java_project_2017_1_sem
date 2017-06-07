import java.util.Scanner;
public class Schedule {
	private int year;
	private int month;
	private int day;
	private String memo;
	
	public int getYear()
	{
		return year;
	}
	public int getMonth()
	{
		return month;
	}
	public int getDay()
	{
		return day;
	}
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
	public void ShowYourSchedule()
	{
		System.out.println("==========================================");
		System.out.println(year+"년"+month+"월"+day+"일의 일정은");
		System.out.println(memo);
		System.out.println("==========================================");
	}
	public int compareTo(Schedule o1) {
		if(year<o1.getYear()) return 1;
		else if(year>o1.getYear()) return -1;
		
		else{
			
			if(month<o1.getMonth()) return 1;
			else if(month>o1.getMonth()) return -1;
			
			else{
				
				if(day<o1.getDay()) return 1;
				else if(day>o1.getDay()) return -1;
				else return 0;
			}//End of 2nd else
		}//End of 1th else
	}//End of compareTo
}

