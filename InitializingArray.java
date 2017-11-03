/*here declaring an integer array of size 10,initializing using for loop 1 to 10 and printing all even numbers from an array*/
package array;//created package as array
public class InitializingArray {//declares a class called InitiliazingArray
	//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] Array = new int[10];
      //define
      int limit=10;
      //here we print even number between 1 to 10
      System.out.println("Printing Even numbers between 1 and " + limit);
      
      for (int i=1; i<limit; i++) {// for loop repeats a statement or group of statements while a given condition is true
	      //if the number is perfectly divisible by 2 then this will print the even number
    	  if( i % 2 == 0){//here if statement is true displays information
              System.out.print(i + " ");//system is used to return code
				//out is static member
				//Println is used to print text i and gives output
    		  
	}

}
}
}

