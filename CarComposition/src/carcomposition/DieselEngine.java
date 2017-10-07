
package carcomposition;


public class DieselEngine extends Engine{
    
    public DieselEngine(double price_, int power_) {
        super(price_, power_);
    }
    
     double getPrice() {
        return super.getPrice() - 1000.00;
    }
}
