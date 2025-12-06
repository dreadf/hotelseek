import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
            Pengguna input:
                1. Prioritas Anda: (1)Review (2)Price (3)Balanced
        */

        String[] locations = {
            "Dharmahusada", "Mulyosari", "Gubeng", "Manyar", "Kertajaya",
            "Kejawan", "Keputih", "Nginden", "Semolowaru", "Merr"
        };
        
        HotelSeek system = new HotelSeek(locations.length, locations);
        
        // From Dharmahusada
        system.addRoute("Dharmahusada", "Mulyosari", 7);
        system.addRoute("Dharmahusada", "Gubeng", 5);
        system.addRoute("Dharmahusada", "Manyar", 5);
        system.addRoute("Dharmahusada", "Kertajaya", 4);
        
        // From Mulyosari
        system.addRoute("Mulyosari", "Kejawan", 3);
        
        // From Gubeng
        system.addRoute("Gubeng", "Manyar", 10);
        
        // From Manyar
        system.addRoute("Manyar", "Kertajaya", 6);
        system.addRoute("Manyar", "Semolowaru", 6);
        
        // From Kertajaya
        system.addRoute("Kertajaya", "Kejawan", 4);
        system.addRoute("Kertajaya", "Nginden", 10);
        system.addRoute("Kertajaya", "Semolowaru", 8);
        
        // From Kejawan
        system.addRoute("Kejawan", "Keputih", 6);
        
        // From Keputih
        system.addRoute("Keputih", "Nginden", 7);
        
        // From Nginden
        system.addRoute("Nginden", "Semolowaru", 2);
        
        // From Semolowaru
        system.addRoute("Semolowaru", "Merr", 3);
        

        // Dharmahusada
        system.addHotel("MaxOne Hotel", 4.5, 371000, "Dharmahusada");
        system.addHotel("The Alimar", 4.6, 750000, "Dharmahusada");
        
        // Mulyosari
        system.addHotel("Frank's Hotel", 4.1, 246000, "Mulyosari");
        
        // Gubeng
        system.addHotel("Oriza Hotel", 4.2, 261000, "Gubeng");
        system.addHotel("Hotel Kita", 3.9, 147000, "Gubeng");
        
        // Manyar
        system.addHotel("Swiss Bell-in", 4.5, 558000, "Manyar");
        system.addHotel("Mercure", 4.7, 652000, "Manyar");
        system.addHotel("Pratisarawirya", 4.1, 120000, "Manyar");
        
        // Kertajaya
        system.addHotel("Oakwood", 4.8, 1050000, "Kertajaya");
        system.addHotel("Mandiri Mansion", 4.3, 311000, "Kertajaya");
        
        // Kejawan
        system.addHotel("Aloft Pakuwon City", 4.7, 968000, "Kejawan");
        
        // Nginden
        system.addHotel("Hotel La Lisa", 4.4, 388000, "Nginden");
        
        // Semolowaru
        system.addHotel("Kanna Stay", 4.5, 218000, "Semolowaru");
        
        // MERR
        system.addHotel("Hotel O", 3.8, 92000, "Merr");
        system.addHotel("Hotel Gunawangsa", 4.3, 367000, "Merr");
        
        // for(Hotel v:system.getHotels()){
        //     v.printHotel();
        //     System.out.println(" ");
        // }

        Scanner input = new Scanner(System.in);

        // System.out.println("Selamat Datang di HotelSeek");
        // System.out.println("Sebelumnya, mohon beritahu kami prioritas Anda:");
        // System.out.println("(1) Price");
        // System.out.println("(2) Review");
        // System.out.println("(3) Balanced");
        // System.out.print("Silahkan pilih salah satu dari ketiga opsi sesuai angkanya: ");
        
        System.out.println("\n");
        System.out.println("=============================================================");
        System.out.println("   _   _       _       _ ____            _    ");
        System.out.println("  | | | | ___ | |_ ___| / ___|  ___  ___| | __");
        System.out.println("  | |_| |/ _ \\| __/ _ \\ \\___ \\ / _ \\/ _ \\ |/ /");
        System.out.println("  |  _  | (_) | ||  __/ |___) |  __/  __/   < ");
        System.out.println("  |_| |_|\\___/ \\__\\___|_|____/ \\___|\\___|_|\\_\\");
        System.out.println("                                              ");
        System.out.println("        FIND YOUR PERFECT STAY IN SURABAYA    ");
        System.out.println("=============================================================");
        System.out.println("");
        System.out.println("   Apa prioritas utama Anda hari ini?");
        System.out.println("   ----------------------------------");
        System.out.println("   [1] 💰 PRICE     ");
        System.out.println("   [2] ⭐ REVIEW    ");
        System.out.println("   [3] ⚖️ BALANCED  ");
        System.out.println("   [4] 📍 LOCATION  ");
        System.out.println("");
        System.out.println("=============================================================");
        
        System.out.println(" ");
        System.out.print("   >> Masukkan pilihan Anda (1-4): ");
        int prioritas = input.nextInt();
        System.out.println(" ");

        System.out.println("=============================================================");
        
        System.out.println(" ");
        System.out.println("   Lokasi yang Tersedia:");
        System.out.println("   " + String.join(", ", locations));
        System.out.println(" ");
        System.out.print("   >> Masukkan lokasi Anda saat ini: ");
        String startLocation = input.next();
        System.out.println(" ");
        
        while (system.getGraph().getIndex(startLocation) == -1) {
            System.out.println("   Lokasi tidak ketemu! Tolong pilih sesuai lokasi yang tersedia");
            System.out.print("   >> Masukkan lokasi Anda saat ini: ");
            startLocation = input.next();
            System.out.println(" ");
        }

        System.out.println("=============================================================");
        System.out.println(" ");

        ScoreCalculator calculator = new ScoreCalculator();

        if(prioritas == 4){
            calculator.calculateLocation(system.getHotels(), system.getGraph(), startLocation);
        } else {
            calculator.calculateScore(system.getHotels(), prioritas);
        }

        Sorting.quickSort(system.getHotels());
        Hotel bestHotel = system.getHotels().get(0);
        
        double bestScore = system.getHotels().get(0).getScore();
        List<Hotel> topPicks = new ArrayList<>();
        
        for (Hotel h : system.getHotels()) {
            if (h.getScore() == bestScore) {
                topPicks.add(h);
            } 
        }
        
        System.out.println("FOUND " + topPicks.size() + " RECOMMENDED OPTION(S)");
        System.out.println(" ");
        System.out.println("=============================================================");
        System.out.println(" ");

        for (Hotel h : topPicks) {
            System.out.println("\n----------------- [ " + h.getName() + " ] -----------------");
            System.out.println("");
            h.printHotel();
            Dijkstra.PathResult result = Dijkstra.findShortestPath(system.getGraph(), startLocation, bestHotel.getLocation());
        
            System.out.println("Dari\t\t: " + startLocation);
            System.out.println("Ke\t\t: " + bestHotel.getLocation());
            System.out.println("Jarak\t\t: " + result.getDistance() + " km");
            System.out.println("Rute\t\t: " + String.join(" → ", result.getPath()));
            System.out.println(" ");
        }
        System.out.println("=============================================================");
        
        // for(Hotel h: system.hotels){
        //     System.out.printf("%-25s | %s", h.getName(), h.getScore());
        //     System.out.println(" ");
        // }
    }
}

