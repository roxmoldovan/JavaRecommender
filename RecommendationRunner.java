
/**
 * Write a description of RecommendationRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class RecommendationRunner implements Recommender {
    public ArrayList<String> getItemsToRate() {
        ArrayList<String> movies = MovieDatabase.filterBy(new TrueFilter());
        ArrayList<String> toRet = new ArrayList<String>();
        for(int i = 0; i < 25; i ++) {
            toRet.add(movies.get(i));
        }
        return toRet;
    }

    public void printRecommendationsFor(String webRaterID) {
        FourthRatings fr = new FourthRatings();
        //AllFilters f = new AllFilters();
        //f.addFilter(new GenreFilter("Comedy"));
        //f.addFilter(new YearAfterFilter(2000));
        ArrayList<Rating> movies = fr.getSimilarRatingsByFilter(webRaterID, 50, 2, new TrueFilter());
        if(movies.size() == 0) {
            System.out.println("<p>Sorry, there are no recommendations for you.</p>");
            System.exit(1);
        }
        System.out.println("<table>");
        System.out.println("<tr><th>Rank</th><th>Movie Title</th></tr>");
        for(int i = 0; i < 15; i ++) {
            System.out.println("<tr><td>"+(i+1)+"</td><td>" + MovieDatabase.getTitle(movies.get(i).getItem()) + "</td></tr>");
        }
        System.out.println("</table>");
    }
    
}
