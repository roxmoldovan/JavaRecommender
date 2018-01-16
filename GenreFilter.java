/**
 * Write a description of GenreFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 *  Create a new class named GenreFilter that implements Filter. The constructor should have one parameter named genre representing
 *  one genre, and the satisfies method should return true if a movie has this genre. Note that movies may have several genres.
 */
public class GenreFilter implements Filter {
    private String genre;

    public GenreFilter(String genre) {
        this.genre = genre;
    }
    
    @Override
    public boolean satisfies(String id) {
        if(MovieDatabase.getGenres(id).contains(genre))
            return true;
        return false;
    }
}