
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.student;
import com.student.manage.studentDao;

public class Start {
	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to DELETE Student");
			System.out.println("Press 3 to DISPLAY Student");
			System.out.println("Press 4 to EXIT App");
			int c = Integer.parseInt(br.readLine());
			if(c==1) {
//				Add Student
				System.out.println("Enter Student Name");
				String name = br.readLine();
				System.out.println("Enter Phone Number");
				String phone = br.readLine();
				System.out.println("Enter Student Age");
				int age = Integer.parseInt(br.readLine());
				System.out.println("Enter Student City");
				String city = br.readLine();
				
				// create student object to store student
				student st = new student(name,phone,age,city);
//				System.out.println(st);
				boolean ans= studentDao.insertStudentToDB(st);
				if(ans) {
					System.out.println("The Student has Successfully Added");
				}
				else {
					System.out.println("Something Went Wrong Try Again");
				}
				
			}
			else if (c==2) {
//				Delete Student
				System.out.println("Enter Id of Student to delete:");
				int userID = Integer.parseInt(br.readLine());
				Boolean f = studentDao.deleteStudent(userID);
				if(f) {
					System.out.println("Deleted Successfully");
				}
				else {
					System.out.println("Something Went Wrong Try Again");
				}
			}
			else if (c==3) {
//				Display Student
				studentDao.displayStudent();
			}
			else if(c==4){
//				Exit App
				break;
			}
			else {
			}
			
		}
		System.out.println("Thank You For Using My Application");
	}

}
