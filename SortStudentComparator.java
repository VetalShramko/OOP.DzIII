package dz;

import java.util.Comparator;



public class SortStudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student) o1;
		Student st2 = (Student) o2;
		String surname1=st1.getSurname();
		String surname2=st2.getSurname();
		int compare = surname1.compareTo(surname2);
		if (compare < 0){
			return 1;
		    
		} else if (compare > 0) {
			return -1;
		} else {
			return 0;
		}
		
	}
 
}
