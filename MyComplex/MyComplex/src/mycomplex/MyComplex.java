/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycomplex;

/**
 *
 * @author POLAK
 */
public class MyComplex {

    /**
     * @return the real
     */
    public double getReal() {
        return real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * @return the imag
     */
    public double getImag() {
        return imag;
    }

    /**
     * @param imag the imag to set
     */
    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real_, double imag_) {
        this.real = real_;
        this.imag = imag_;
    }
    public String toString() {
        return (real +" + " + imag + "i\n");
    }
    public boolean isReal() {
        return (imag==0);
    }
    public boolean isImaginary() {
        return (imag!=0);
    }
    
    public boolean equals(double real_, double imag_) {
        return (this.real==real_ && this.imag == imag_);
    }
    public boolean equals(MyComplex another) {
        return (this.real==another.real && this.imag ==another.imag);
    }
    public double magnitude() {
        return Math.sqrt(real*real+imag*imag);
    }
    public double argument() {
        return Math.atan2(imag, real);
    }
    public MyComplex add(MyComplex right) {
        this.real = this.real+right.getReal();
        this.imag = this.imag+right.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        right.real = this.real+right.getReal();
        right.imag = this.imag+right.getImag();
        return right;
    }
    public MyComplex subtract(MyComplex right) {
        this.real = this.real-right.getReal();
        this.imag = this.imag-right.getImag();
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        right.real = this.real-right.getReal();
        right.imag = this.imag-right.getImag();
        return right;
    }
    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real;
        this.imag = this.imag * right.imag;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        this.real = this.real / right.real;
        this.imag = this.imag / right.imag;
        return this;
    }
    public MyComplex conjugate() {
        imag = -imag;
        return this;
    }
    private double real = 0.0;
    private double imag = 0.0;
    
    MyComplex() {
    }
    MyComplex(double real_, double imag_) {
        this.real = real_;
        this.imag = imag_;
    }

    
}
