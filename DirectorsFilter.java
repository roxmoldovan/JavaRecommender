/**
 * Write a description of DirectorsFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.HashSet;
public class DirectorsFilter implements Filter {
    private String[] directors;
    
    public DirectorsFilter(String dir) {
        directors = dir.split(",");
    }
    
    @Override
    public boolean satisfies(String id) {
        String dirsOfMovie = MovieDatabase.getDirector(id);
        for(String d : directors) {
            if(dirsOfMovie.contains(d)) {
                return true;
            }
        }
        return false;
    }
}
