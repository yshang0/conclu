//366_Fibonacci

int[] f;
int cal(int n) {
    
    
    if(f[n] != -1) {
        return f[n];
    }
    if(n == 1) {
        f[n] = 0;
        return f[n];
    }
    if(n == 2) {
        f[n] = 1;
        return f[n];
    }
    f[n] = cal(n - 1) + cal(n - 2);
    return f[n];
}
public int fibonacci(int n) {
    f = new int[n + 1];
    for(int i = 0; i < n + 1; i++) {
        f[i] = -1;
    }
    return cal(n);
    
    
}