package Assignment11;

import java.security.KeyStore;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {

		HashMap<Key, Student> h = new HashMap<>();
		for (Student stu: students){
		Key key = new Key(stu.getFirstName(), stu.getLastName());
			h.put(key, stu);
		}
		return h;
	}


	public static double computeAverageGPA(HashMap<Key,Student> maps){
		Set<Key> key1 = maps.keySet();
		double sum = 0.0;
		for(Key key: key1) {
			Student c = maps.get(key);
			sum += c.getGpa();
		}
		return sum / key1.size();
	}

}


