package Calculadora;

public class DatosCal {
    public double Ms1;               //Masa1
    public double Ms2;               //Masa2
    public double g = 9.8;           //Gravedad en m/s2
    public double M;                //Coeficiente de friccion

    public double getMs1() {
        return Ms1;
    }

    public void setMs1(double ms1) {
        Ms1 = ms1;
    }

    public double getMs2() {
        return Ms2;
    }

    public void setMs2(double ms2) {
        Ms2 = ms2;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getM() {
        return M;
    }

    public void setM(double m) {
        M = m;
    }

    public double CalcularAceleracion() {
        return (g * Ms1 - (g * Ms2 * M)) / (Ms1 + Ms2);
    }
    public double CalcularTension() {
        return (g * Ms2 * M) + (Ms2 * CalcularAceleracion());
    }
    public String displayResults() {
        return String.format("La aceleración de los objetos es %,2fm/s², y la tensión del cable es %,2fN.", CalcularAceleracion(), CalcularTension());
    }
}
