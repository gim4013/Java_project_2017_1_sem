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
		System.out.println("������ �⵵�� �Է��ϼ��� : ");
		year = scan.nextInt();
		System.out.println("������ ���� �Է��ϼ��� : ");
		month = scan.nextInt();
		System.out.println("������ ���� �Է��ϼ��� : ");
		day = scan.nextInt();
		
		System.out.println("������ �����ּ���");
		memo = scan1.nextLine();
	}
	public void ShowYourSchedule()
	{
		System.out.println("==========================================");
		System.out.println(year+"��"+month+"��"+day+"���� ������");
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

