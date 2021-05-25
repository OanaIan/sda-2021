package lab5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Maria", "Popescu", 5, 7);
		Student student2 = new Student("Ana", "Radu", 8, 9);
		Student student3 = new Student("Ioana", "Ionescu", 10, 10);
		Student student4 = new Student("Mihai", "Ilie", 5, 9);
		Student student5 = new Student("Radu", "Grigorescu", 7, 6);
		Student student6 = new Student("Ionut", "Avramescu", 7, 5);
		Student student7 = new Student("Alexandru", "Turlea", 4, 8);
		Student student8 = new Student("Irina", "Butnaru", 6, 10);
		Student student9 = new Student("Lia", "Nedelcu", 10, 9);
		Student student10 = new Student("Tudor", "Iacob", 10, 8);

		HashMap<String, Student> student_HashMap = new HashMap<>();

		student_HashMap.put("1", student1);
		student_HashMap.put("2", student2);
		student_HashMap.put("3", student3);
		student_HashMap.put("4", student4);
		student_HashMap.put("5", student5);
		student_HashMap.put("6", student6);
		student_HashMap.put("7", student7);
		student_HashMap.put("8", student8);
		student_HashMap.put("9", student9);
		student_HashMap.put("10", student10);

		LinkedHashMap<String, Student> student_LinkedHashMap = new LinkedHashMap<>();

		student_LinkedHashMap.put("1", student1);
		student_LinkedHashMap.put("2", student2);
		student_LinkedHashMap.put("3", student3);
		student_LinkedHashMap.put("4", student4);
		student_LinkedHashMap.put("5", student5);
		student_LinkedHashMap.put("6", student6);
		student_LinkedHashMap.put("7", student7);
		student_LinkedHashMap.put("8", student8);
		student_LinkedHashMap.put("9", student9);
		student_LinkedHashMap.put("10", student10);

		Scanner scan = new Scanner(System.in);
		String identif = scan.nextLine();

		System.out.println(student_HashMap.get(identif));

		for (String key : student_HashMap.keySet()) {
			System.out.println(key);
		}

		System.out.println();

		System.out.println(student_LinkedHashMap.get(identif));

		for (String key : student_LinkedHashMap.keySet()) {
			System.out.println(key);
		}

		scan.close();

	}
}