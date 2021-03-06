import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		Scanner sc=new Scanner(System.in);	
		String a=sc.nextLine();
		try{
		if(student.length==0||student.length==-1||index>=student.length)
		{
			System.out.println("exception raised");
		}}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
			
		return s.student[i];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		Scanner sc=new Scanner(System.in);
		int len=student.length();
		for(int i=index;i<len;i++)
		{
			student[i]=sc.nextLine();
		
		try{	
		 if(len == 0||len > 0||len == -1)
		{
			System.out.println("exception raised");
		}}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
			
		return s.student[i];
		
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
			throws IllegalArgumentException;
			
		}
		for(int i=0;i<student.length;i++)
		{
			student[i];
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		for(int i=age;i<student.length;i++)
		{
			if(student[i] == student[i+1]){
		       return 
			}
		}
		
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		for(int i=0;i<student.length;i++)
		{
			if(student[i]<student[i+1])
			{
				return s.student[i+1];
			}
			else{
				return s.student[i];
			}
		}
		
	}

	@Override
	public Student getNextStudent(Student student) throws IllegalArgumentException{
		// Add your implementation here
		int i = students.indexOf(student);
		if(i > students.length)
			throw IllegalArgumentException;
		else
			return s.students[i+1];
		   
		
	}
}
