package four;

import static java.lang.Math.*;

public class MathFunc implements MathCalculable{
    private double d;
    private double mn;

    public MathFunc(double d, double mn) {
        this.d = d;
        this.mn = mn;
    }
    public double mod(){
        return sqrt(d*d+mn*mn);
    }
    public String sqr(int s){
        double A = sqrt(d*d+mn*mn);
        double al = atan(mn/d);
        double newd = pow(A,s)*cos(al*s);
        double mn = sin(al*s)*pow(A,s);
        return newd+" + i*"+mn;
    }

    @Override
    public String toString() {
        return "MathFunc{" +
                d +
                "+ i*" + mn +
                '}';
    }
}
