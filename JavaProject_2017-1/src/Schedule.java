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
		System.out.println("������ �⵵�� �Է��ϼ��� : ");
		year = scan.nextInt();
		System.out.println("������ ���� �Է��ϼ��� : ");
		month = scan.nextInt();
		System.out.println("������ ���� �Է��ϼ��� : ");
		day = scan.nextInt();
		
		System.out.println("������ �����ּ���");
		memo = scan1.nextLine();
		
	}
	public void AddScheduleTest()
	{
		System.out.println(year+"��"+month+"��"+day+"���� ������");
		System.out.println(memo);
	}
}
