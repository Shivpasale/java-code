import java.util.*;
class GradeCalculator 
{
	public static void main(String[] args)
	{
    		Scanner scanner=new Scanner(System.in);
    		System.out.println("Enter marks for Physics, Chemistry, Biology, Mathematics, and Computer:");
        	System.out.print("Physics: ");
        	double physicsMarks = scanner.nextDouble();
        	System.out.print("Chemistry: ");
        	double chemistryMarks = scanner.nextDouble();
        	System.out.print("Biology: ");
        	double biologyMarks = scanner.nextDouble();
        	System.out.print("Mathematics: ");
        	double mathematicsMarks = scanner.nextDouble();
        	System.out.print("Computer: ");
        	double computerMarks = scanner.nextDouble();
		double totalMarks = physicsMarks + chemistryMarks + biologyMarks + mathematicsMarks + computerMarks;
        	double percentage = (totalMarks / 500) * 100;
        	String grade;
        	if (percentage >= 90) 
		{
        		grade = "Grade A";
        	} 
		else if (percentage >= 80) 
		{
         		grade = "Grade B";
        	} 
		else if (percentage >= 70) 
		{
            		grade = "Grade C";
        	} 
		else if (percentage >= 60) 
		{
            		grade = "Grade D";
        	} 
		else if (percentage >= 40) 
		{
            		grade = "Grade E";
        	} 
		else 
		{
            		grade = "Grade F";
        	}
        	System.out.println("\nPercentage: " + percentage + "%");
        	System.out.println("Grade: " + grade);
	}
}
