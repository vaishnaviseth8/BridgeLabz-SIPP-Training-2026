import java.util.*;
public class Main{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int[] marks=new int[5];
	int total=0;
	double avg;
	for(int i=0;i<5;i++){
		marks[i]=sc.nextInt();
		total+=marks[i];
	}
	avg=total/5.0;
	System.out.println("Average = " + avg);
        if(avg >= 90) {
            System.out.println("Grade A");
        }
        else if(avg >= 80) {
            System.out.println("Grade B");
        }
        else if(avg >= 70) {
            System.out.println("Grade C");
        }
        else if(avg >= 60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }
	}
}
	
	

	