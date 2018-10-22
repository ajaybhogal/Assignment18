
package array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        //how many marks
        int markcount = 0;
        int total =0;
        double average;
        
        System.out.print("How many marks for this student?");
        markcount = Keyboard.nextInt();
        
        
        int[] marks = new int[markcount];
        
        //loop
        for(int i=0; i<markcount; i++){
            // let's ask the 
            System.out.print("Please enter the mark " + (i+1) + ": ");
            marks[i] = Keyboard.nextInt();
        }
        
            System.out.print("The marks are  " );
            for(int i=0; i<markcount; i++){
                total = total + marks[i];
                System.out.print(marks[i]);
            
            if(i<(markcount-1)){
            System.out.print(",");
        }
            
            
             }
             System.out.println("");
        average = total/marks.length;
        System.out.format("Average of marks :"+average);
        
    }
    
}
