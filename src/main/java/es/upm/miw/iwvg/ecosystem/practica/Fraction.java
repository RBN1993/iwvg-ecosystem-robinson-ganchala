package es.upm.miw.iwvg.ecosystem.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double sumInteger(int i) {
        return (double) (this.numerator + i * this.denominator) / this.denominator;
    }

    public double subtractInteger(int i) {
        return (double) (this.numerator - i * this.denominator) / this.denominator;
    }
}