import java.util.*;

public class HotelSeek {
    Graph cityMap;
    List<Hotel> hotels;

    public HotelSeek(int nLocation, String[] locations){
        this.cityMap = new Graph(nLocation, locations);
        this.hotels = new ArrayList<>();
    }

    public List<Hotel> getHotels(){
        return hotels;
    }

    public void addHotel(String name, double review, int price, String location){
        hotels.add(new Hotel(name, review, price, location));
    }

    public void addRoute(String from, String to, int distance){
        int fromIndex = cityMap.getIndex(from);
        int toIndex = cityMap.getIndex(to);

        if (fromIndex != -1 && toIndex != -1) {
            cityMap.addEdge(fromIndex, toIndex, distance);
        }
    }
} 
