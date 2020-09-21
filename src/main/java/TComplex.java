import static java.lang.Math.*;

public class TComplex extends Complex{
    TComplex (double a, double b) {
        super(a, b);
    }
    TComplex (String str) {
        super (str);
    }

    TComplex(double a) {
        super(a);
    }

    TComplex() {
        super();
    }

    public Complex copy() {
        return new TComplex (real, imaginary);
    }

    public Complex square() {
        return new TComplex (real * real - imaginary * imaginary, real * imaginary + real * imaginary);
    }

    public Complex reverse() {
        return new TComplex (real/(real*real + imaginary*imaginary), (-1)*imaginary/(real*real + imaginary*imaginary));
    }

    public Complex minus() {
        return new TComplex (real*(-1), imaginary*(-1));
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public String getStr() {
        return Double.toString(real) + "+i" + Double.toString(imaginary);
    }

    public Complex sum(Complex b) {
        return new TComplex(real + b.real, imaginary + b.imaginary);
    }

    public Complex sub(Complex b) {
        return new TComplex(real - b.real, imaginary - b.imaginary);
    }

    public Complex mul(Complex b) {
        return new TComplex(real * b.real - imaginary * b.imaginary, real * b.imaginary + b.real * imaginary);
    }

    public Complex div(Complex b) {
        return new TComplex((real*b.real + imaginary*b.imaginary)/(b.real*b.real + b.imaginary*b.imaginary), (imaginary*b.real - real*b.imaginary)/(b.real*b.real + b.imaginary*b.imaginary));
    }

    public boolean compare(Complex b) {
        if (abs(imaginary - b.imaginary) <= 0.1 && abs(real - b.real) <= 0.1) {
            return true;
        }
        return false;
    }

    public double absolute() {
        return sqrt(real*real +imaginary*imaginary);
    }

    public double rad() {
        return atan(imaginary/real);
    }

    public double grad() {
        return atan(imaginary/real)/(2*Math.PI)*360;
    }

    public Complex power(int n) {
        return new TComplex(pow(absolute(), n)*cos(rad()*n), pow(absolute(),n)*sin(rad()*n));
    }

    public Complex radical(double n, int i){
        return new TComplex(pow(absolute(), 1/n)*cos((rad() + 2 * PI * i)/n), pow(absolute(),1/n)*sin((rad() + 2 * PI * i)/n));
    }
}
