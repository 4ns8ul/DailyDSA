
import com.college.details.CollegeDetails.CollegeDetails;
import com.college.details.Student.Student;
import com.college.details.Teacher.Teacher;
import java.util.Scanner;

class MyProg{
	public static void main(String[] args){
		CollegeDetails cd = new CollegeDetails();
		cd.print();
		
		Student st = new Student();
		st.print();
		
		Teacher tc = new Teacher();
		tc.print();
	}
}