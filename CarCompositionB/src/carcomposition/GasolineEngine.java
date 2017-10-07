/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carcomposition;

public class GasolineEngine extends Engine {

    private int tuningLevel = 0;

    public GasolineEngine(double weight_, double price_, int power_) {
        super(weight_, price_, power_);
    }

    public void setTuningLevel(int tuningLevel_) {
        if ((tuningLevel_ > 0) && (tuningLevel_ < 5)) {
            tuningLevel = tuningLevel_;
        } else {
            System.out.print("improper value for tuningLevel: ");
            System.out.println(tuningLevel_);
        }
    }

    double getPrice() {
        double factor = 1 + 0.2 * tuningLevel;
        return super.getPrice() * factor;
    }
}
