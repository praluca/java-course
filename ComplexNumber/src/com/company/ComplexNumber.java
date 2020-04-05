package com.company;

public class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = real + this.real;
        this.imaginary = imaginary + this.imaginary;
    }
    public void add(ComplexNumber complexNumber) {
        add(complexNumber.getReal(),complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real =  this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }
    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.getReal(),complexNumber.getImaginary());
    }
}
