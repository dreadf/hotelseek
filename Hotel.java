public class Hotel {
    String name;
    double review;
    int price;
    String location;
    double score;

    public Hotel(String name, double review, int price, String location){
        this.name = name;
        this.review = review;
        this.price = price;
        this.location = location;
        this.score = 0.0;
    }

    public String getName(){
        return name;
    }

    public double getReview(){
        return review;
    }

    public int getPrice(){
        return price;
    }

    public String getLocation(){
        return location;
    }

    public void setScore(double score){
        this.score = score;    
    }

    public double getScore(){
        return score;
    }

    public void printHotel(){
        System.out.println("Name\t\t: " + getName());
        System.out.println("Review\t\t: " + getReview());
        System.out.println("Price\t\t: " + getPrice());
        System.out.println("Location\t: " + getLocation());
    }
}
