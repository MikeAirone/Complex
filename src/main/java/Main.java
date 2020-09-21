import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("First complex: ");
            String str = br.readLine();

            Complex fr1 = new TComplex(str);

            System.out.println("Second complex: ");
            str = br.readLine();

            Complex fr2 = new TComplex(str);

            System.out.println("\nSum = " + fr1.sum(fr2).getStr());

            System.out.println("Sub = " + fr1.sub(fr2).getStr());

            System.out.println("Mul = " + fr1.mul(fr2).getStr());

            System.out.println("Div = " + fr1.div(fr2).getStr());

            System.out.println("Grad = " + fr1.grad());

            System.out.println("Abs = " + fr1.absolute());

            System.out.println("Rad = " + fr1.rad());

            System.out.println("Reverse = " + fr1.reverse().getStr());

            System.out.println("Power = " + fr1.power(4).getStr());

            System.out.println("sqrt = " + fr1.radical(4, 3).getStr());

        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException: " + ex.getMessage());
        }
    }
}
