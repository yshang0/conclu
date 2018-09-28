//391_Number_of_Airplanes_in_the_Sky

class Point {
    int time;
    int landing;
    
    Point(int t, int i) {
        this.time = t;
        this.landing = i;
    }
}
public int countOfAirplanes(List<Interval> airplanes) {
    int result = 0;
    List<Point> planes = new ArrayList<>();
    for (Interval inter : airplanes) {
        planes.add(new Point(inter.start, 1));
        planes.add(new Point(inter.end, -1));
    } // time : n, n : airplanes.size();
      // space: n,
    Collections.sort(planes, new Comparator<Point>() {
        public int compare(Point a, Point b) {
            if(a.time != b.time) {
                return a.time - b.time;
            }
            return a.landing - b.landing;
        }
    });
    //time: O(nlogn)
    int count = 0;
    for(Point p : planes) {
        count += p.landing;
        result = Math.max(result, count);
    }
    return result;
    
    //time: O(nlogn);
    //space:O(n);
}