import java.util.Scanner;

/**
 *  program that will populate an array with 2 spots in it. Once those two spots are populated, if the value at index 0 is bigger than the value in index 1, I want you to swap the values so that it is in ascending order.
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt the user to enter in 2 values for the array 
    System.out.println("Please enter the 2 values for the array"); 

    //create the array for values 
    int[] arraynum = new int[2];  

    //create variables for index 0 and index 1 
    int indexBig = 0; 
    int indexSmall = 0;
    
    //use for loop to collect values 
    for(int i = 0; i < arraynum.length; i++){
      arraynum[i] = input.nextInt(); 
      if(arraynum[0] > arraynum[1]){ 
        indexBig = arraynum[0]; 
        indexSmall= arraynum[1]; 
      }if(arraynum[0] < arraynum[1]){
        indexBig = arraynum[1]; 
        indexSmall = arraynum[0];
      }
    } 

    //print the answer to the screen 
    System.out.println("Your numbers in ascending order are " + indexSmall + " and " + indexBig); 

  

    
    
  }
}
