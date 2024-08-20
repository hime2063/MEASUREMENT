package models;

public class Measurement {
    double value;

    public Measurement(double value) {
        this.value = value;
    }
    public double getcm(){
        return value * 100;

    }
    public double getkm(){
        return value / 1000;
    }
    public double getmm(){
        return value * 1000;
    }
    public double getdm(){
        return value * 10;
    }
}
