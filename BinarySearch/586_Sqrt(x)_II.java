//586_Sqrt(x) II

public double sqrt(double x) {
        
    double l = 0;
    double r = Math.max(x, 1.0);
    double eps = 1e-12;
    
    while (l + eps < r) {
        double mid = l + (r - l) / 2;
        if (mid * mid < x) {
            l = mid;
        } else {
            r = mid;
        }
    }
    return r;
}