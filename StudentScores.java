package practice07_3_2;

public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private int numStudents;
	private Student student_[];

	public StudentScores() {
		student_ = new Student[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; 
			
		student_[numStudents] = new Student(name, score);
		numStudents++;
	}
	
	

	public String getHighestName() {
		if (numStudents == 0)
			return null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (student_[i].score() > student_[highest].score())
				highest = i;

		return student_[highest].name();
	}
	
	public int getHighestScore() {
		if (numStudents == 0) 
			return (Integer) null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (student_[i].score() > student_[highest].score())
				highest = i;

		return student_[highest].score();
	}
	

	public String getLowestName() {
		if (numStudents == 0)
			return null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (student_[i].score() < student_[lowest].score())
				lowest = i;

		return student_[lowest].name();
	}
	
	public int getLowestScore() {
		if (numStudents == 0)
			return (Integer) null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (student_[i].score() > student_[lowest].score())
				lowest = i;

		return student_[lowest].score();
	}
}