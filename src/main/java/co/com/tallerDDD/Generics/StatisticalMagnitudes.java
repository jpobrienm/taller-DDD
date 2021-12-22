package co.com.tallerDDD.Generics;

import java.io.Serializable;

public class StatisticalMagnitudes implements Serializable {
    private Double mean;
    private Double standardDeviation;
    public StatisticalMagnitudes(Double mean, Double standardDeviation){
        this.mean = mean;
        this.standardDeviation = standardDeviation;
    }

    public Double mean(){return this.mean;}
    public Double standardDeviation(){return this.standardDeviation;}

    public StatisticalMagnitudes of(Double mean, Double standardDeviation) {
        return new StatisticalMagnitudes(mean, standardDeviation);
    }
}
