/**
 * 
 */
package Week2_Q1;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class DVD {

	private String title;
	private String genre;
	private String artist;

	//-------------------//
	//    Constructors   //
	//-------------------//

	
	// If object of this class passing no parameters it must use setters and getters to access this constructor
	public DVD()
	{
		setTitle(title);
		setGenre(genre);
		setArtist(artist);
	}
	
	// If object of this class passing any parameters they are accepted by this constructor
	public DVD(String title, String genre, String artist)
	{
		setTitle(title);
		setGenre(genre);
		setArtist(artist);
	}
	
	// In Java, software decide which constructor to use,it depends on the quantity of passing parameters 
	public DVD(String artist, String title)
	{
		setArtist(artist);
		setTitle(title);
	}

	//-------------------//
	//      Methods      //
	//-------------------//

	// This method is displaying all variables that presented in this class and their parameters
	public String toString()
	{
		return "Title: "  + getTitle() + "\nGenre: " + getGenre() + "\nArtist: " + getArtist() + "\n";
	}

	// This method is calling another method that called <toString> 
	public void print()
	{
		System.out.println(toString());
	}

	//-------------------//
	// Setters & Getters //
	//-------------------//

	// This method is returning parameters form variable title
	public String getTitle() {
		return title;
	}

	// This method is setting variable title with given parameters
	public void setTitle(String title) {
		this.title = title;
	}

	// This method is returning parameters form variable genre
	public String getGenre() {
		return genre;
	}

	// This method is setting variable genre with given parameters from an object of this class in our main
	public void setGenre(String genre) {
		this.genre = genre;
	}

	// This method is returning parameters form variable artist
	public String getArtist() {
		return artist;
	}

	// This method is setting variable artist with given parameters
	public void setArtist(String artist) {
		this.artist = artist;
	}




}
