import static java.lang.Math.atan;
import static java.lang.Math.sqrt;

abstract public class Complex {
    protected double real;
    protected double imaginary;

    Complex(double a, double b) {
        real = a;
        imaginary = b;
    }

    Complex(String str) {
        String[] subStr = str.split("((\\+i)| )");
        try {
            real = Double.parseDouble(subStr[0]);
            imaginary = Double.parseDouble(subStr[1]);
            System.out.println(real + " " +imaginary);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to create Complex with given string " + str, e);
        }
    }

    Complex(double a) {
        imaginary = 0;
        real = a;
    }

    Complex() {
        imaginary = 0;
        real = 0;
    }


    abstract public Complex copy();

    abstract public Complex square();

    abstract public Complex reverse();

    abstract public Complex minus();

    abstract public double getReal();

    abstract public double getImaginary();

    abstract public String getStr();

    abstract public Complex sum(Complex b) ;

    abstract public Complex sub(Complex b);

    abstract public Complex mul(Complex b);

    abstract public Complex div(Complex b);

    abstract public boolean compare(Complex b);

    abstract public double absolute();

    abstract public double rad();

    abstract public double grad();

    abstract public Complex power(int n);

    abstract public Complex radical(double n, int i);
}
