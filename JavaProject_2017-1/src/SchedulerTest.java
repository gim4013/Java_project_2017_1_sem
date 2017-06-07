import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class SchedulerTest {
	public static void main(String[] args) 
	{
		///==========Test==========
		Date date = new Date();
		date.currentTime();
		
		//===========Test==========
		ArrayList<Schedule> schedule_Array = null;
		schedule_Array = new ArrayList<Schedule>();
		while(true)
		{	//=================TestLine=========================
			System.out.println("현재시간 출력하기");
			//=================TestLine=========================
			
			System.out.println("==================================================");
			System.out.println("1.일정추가 2.일정보기 3.일정삭제 4.종료");
			System.out.println("==================================================");
			
			int s = 0;
			Scanner scan_num = new Scanner(System.in);
			s = scan_num.nextInt();
			if(s == 4 ) break;
			switch(s)
			{
			case 1:
				
				Schedule schedule_add = new Schedule();
				schedule_add.AddSchedule();
				schedule_Array.add(schedule_add);
				
				SortingArray sort_Array = new SortingArray();
				Collections.sort(schedule_Array,sort_Array);
				
				break;
			case 2:
				for(Schedule sch_iterator : schedule_Array){
					sch_iterator.ShowYourSchedule();
				}
				break;
			case 3:
				if(schedule_Array.isEmpty()==true){
					System.out.println("저장된 일정이 없습니다.");
					break;	
				}
				else{
					schedule_Array.remove(0);
					break;	
				}
			}//End of switch			
		}//End of While
		return ;
	}//End of Main
}//End of Class
