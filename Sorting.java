import java.util.List;

public class Sorting{
    public static void quickSort(List<Hotel> hotels){
		qSort(hotels, 0, hotels.size()-1);
	}
    
    private static void qSort(List<Hotel> hotels, int fscore, int lscore){
        if(fscore<lscore){
            int pivIndex = partition(hotels, fscore, lscore);
			qSort(hotels, fscore, pivIndex-1);
			qSort(hotels, pivIndex+1, lscore);
        }
    }
    private static int partition(List<Hotel> hotels, int fscore, int lscore) {
		double pivot = hotels.get(fscore).getScore();
		int l = fscore + 1;
		int r = lscore;
		
		do {
			while ((l < lscore) && (pivot <= hotels.get(l).getScore())) l++;
			while ((r > fscore) && (pivot > hotels.get(r).getScore())) r--;
			if (l < r) swap(hotels, l, r);
		} while (l < r);
		
		swap(hotels, fscore, r);
		return r;
	}
    private static void swap(List<Hotel> hotels, int i, int j) {
		Hotel temp = hotels.get(i);
		hotels.set(i, hotels.get(j));
		hotels.set(j, temp);
	}
}