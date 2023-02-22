
    import java.util.HashMap;
import java.util.Scanner;

public class Attendance {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<String, Integer> attendance = new HashMap<>();

    System.out.println("--------------------Welcome to the Attendance System!--------------------");
    while (true) {
      System.out.print("Please enter student University Number: ");
      String uniNum = input.nextLine();

      if (attendance.get(uniNum) == null) {
        attendance.put(uniNum, 0);
        System.out.println("The student Has been added to the system.");

        System.out.print("Is the sudent present? (y/n) ");
        String present = input.nextLine();
  
        if (present.equals("n")) {
          int absences = attendance.get(uniNum);
          absences++;
          attendance.put(uniNum, absences);
          System.out.println("Student absence has been recorded.");
          
        }

      } else {
        System.out.println("The student has already been added to the system.");
        
      }

    

      System.out.print("Do you want to enter another student (y/n): ");
      String anotherStudent = input.nextLine();

      if (anotherStudent.equals("n")) {
        break;
      }
    }

    // print out the attendance
    System.out.println("\nAttendance:");
    for (String uniNum : attendance.keySet()) {
      int absences = attendance.get(uniNum);
      System.out.println("University Number: " + uniNum + ", Absences: " + absences);
    }
  }

}

