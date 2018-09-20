//771_Double_Factorial

public long doubleFactorial(int n) {
    return fac(n);
}
public long fac(int n) {
    if(n == 2 || n == 1) {
        return n;
    }
    return n * fac(n - 2);
}