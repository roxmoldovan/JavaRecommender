
/**
 * Write a description of MinutesFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinutesFilter implements Filter {
    private int min, max;
    
    public MinutesFilter(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    private boolean inRange(int minutes) {
        if(minutes <= max && minutes >= min) return true;
        return false;
    }
    
    @Override
    public boolean satisfies(String id) {
        if(inRange(MovieDatabase.getMinutes(id)))
            return true;
        return false;
    }
}