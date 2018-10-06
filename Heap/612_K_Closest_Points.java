//612_K_Closest_Points

public Point[] kClosest(Point[] points, Point origin, int k) {
    Queue<Point> q = new PriorityQueue<>(new Comparator<Point>() {
        public int compare (Point a, Point b) {
            if (dist(a, origin) != dist(b, origin)) {
                return dist(a, origin) - dist(b, origin);
            }
            if (a.x != b.x) {
                return a.x - b.x;
            }
            return a.y - b.y;
        }
    });
    
    for (Point p : points) {
        q.offer (p);
    }
    
    Point[] result = new Point[k];
    for (int i = 0; i < k; i++) {
        result[i] = q.poll();
    }
    return result;
}
public int dist (Point a, Point b) {
    return (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
}
//time:O(n log n);
//space:O(n);