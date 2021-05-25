package lab5;

public class Student {

	private String name;
	private String lastName;
	private double LibRomGrade;
	private double MatGrade;

	public Student(String name, String lastName, double MatGrade, double LibRomGrade) {
		this.name = name;
		this.lastName = lastName;
		this.LibRomGrade = MatGrade;
		this.MatGrade = LibRomGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getLibRomGrade() {
		return LibRomGrade;
	}

	public void setLibRomGrade(double mathGrade) {
		this.LibRomGrade = mathGrade;
	}

	public double getMatGrade() {
		return MatGrade;
	}

	public void setMatGrade(double roGrade) {
		this.MatGrade = roGrade;
	}

	@Override
	public String toString() {
		return "Nume: " + name + "\n" + "Prenume " + lastName + "\n" + "Nota matematica: " + MatGrade + "\n"
				+ "Nota limba romana: " + LibRomGrade + "\n";
	}

}