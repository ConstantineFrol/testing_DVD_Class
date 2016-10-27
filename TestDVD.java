/**
 * <p>Part a)	Write this code into BlueJ explaining each line marked with a comment.</p>
 * <p>Part b)	Fix any problems encountered.</p>
 * <p>Part c)	To ensure this class works you will need to create the DVD class which will be 
 *			a template for creating as many DVD objects as you require of the same type.
 *			Firstly you need to draw the class diagram and then write your code.
 *			Use the main test above to see if it works.</p>
 */
package Week2_Q1;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class TestDVD {

	public static void main(String[] args) {

		/**
		 *  @param dvd1 ----------	Object of the Class DVD,
		 *  @param dvd1.setTitle - 	setting the variable title with given parameters  
		 *  @param dvd1.setGenre -  setting the variable genre with given parameters 
		 *  @param dvd1.setArtist - setting the variable artist with given parameters 
		 *  @param dvd1.print()  -  calling method toString
		 *  @param dvd2 ----------	another Object of the Class DVD,that passing parameters to constructor
		 *  @param dvd2.print()  -  calling method toString
		 *  @param toString() ----  displaying all variables and their parameters for the particular object
		 */
		DVD dvd1 = new DVD(); // Here we made an Object of the class , called DVD
		dvd1.setTitle("Song Bird"); // Here we set variable title, using setters in class DVD
		dvd1.setGenre("Blues");
		dvd1.setArtist("Eva Cassidy");
		dvd1.print();

		DVD dvd2 = new DVD("Johnny B. Goode", "Chuck Berry");
		dvd2.print();// This method will call another method that called toString, to display all variables that in the class DVD and their parameters


	}

}
