import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[]args){
        Scanner scanner =   new Scanner (System.in);

        System.out.println("Enter the number of subjects:");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++){
            System.out.println("Enter marks obtained in subject" +i+":");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagepercentage = (double) totalMarks / numOfSubjects;


        char grade;
        int avgpercentageRounded = (int) Math.round(averagepercentage*1000.00);
        switch (avgpercentageRounded / 10000){
        case 10:
            grade = 'O';
            break;
        case 9:
            grade = 'E' ;
            break;
        case 8:
            grade = 'A' ;
            break;
        case 7:
            grade = 'B' ;
            break;
        case 6:
             grade = 'C' ;
             break;
        case 5:
              grade = 'D';
              break;
        default:
              grade = 'F';
        }

        System.out.println("Total Marks:" + totalMarks);
        System.out.println("Average percentage :" + averagepercentage + "%");
        System.out.println("Grade:" + grade);

        scanner.close();
    }
}
         
            