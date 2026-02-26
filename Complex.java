import java.util.Scanner;

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class complexadd {
    public static void main(String[] args) {

        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        Complex result1 = c1.add(c2);

        System.out.println("Without User Input:");
        result1.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first complex number (real imag):");
        Complex s1 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.println("Enter second complex number (real imag):");
        Complex s2 = new Complex(sc.nextInt(), sc.nextInt());


        Complex sum = s1.add(s2);

        System.out.print("Sum = ");
        sum.display();

    }
}

