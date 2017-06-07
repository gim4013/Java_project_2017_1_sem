import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SortingArray implements Comparator<Schedule>{

	@Override
	public int compare(Schedule o1, Schedule o2) {
		if(o1.getYear()==o2.getYear()){
			if(o1.getMonth()==o2.getMonth()){
				if(o1.getDay()>o2.getDay())	
					return o2.compareTo(o1);
				else return o2.compareTo(o1);
			}else
				return o2.compareTo(o1);
		}else
			return o2.compareTo(o1);
	}
}

