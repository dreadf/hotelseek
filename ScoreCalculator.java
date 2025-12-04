import java.util.List;

public class ScoreCalculator {
    public void calculateScore(List<Hotel> hotels, int priority){
        double minPrice = 999999999;
        double maxPrice = -1;

        for(Hotel h: hotels){
            if(h.getPrice() > maxPrice){
                maxPrice = h.getPrice();
            }
            if(h.getPrice() < minPrice){
                minPrice = h.getPrice();
            }
        }

        double wprice = 0;
        double wreview = 0;

        if(priority == 1){
            wprice = 0.7;
            wreview = 0.3;
        } else if (priority == 2){
            wprice = 0.3;
            wreview = 0.7;
        } else if (priority == 3){
            wprice = 0.5;
            wreview = 0.5;
        }

        for(Hotel h: hotels){
            double scoreR = h.getReview()/5;
            double scoreP = 1-((h.getPrice() - minPrice) / (maxPrice - minPrice));
            double scoreFin = (scoreR * wreview) + (scoreP * wprice);
            h.setScore(scoreFin);
        }
    }
}
