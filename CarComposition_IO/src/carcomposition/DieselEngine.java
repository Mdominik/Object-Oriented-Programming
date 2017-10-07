
package carcomposition;


public class DieselEngine extends Engine{

    public DieselEngine(double price_, int power_) {
        super(price_, power_);     
    }
    
     public double getPrice() {
        return super.getPrice(); // - 1000.00;
    }
     
     public String getType(){
         return "DieselEngine  "; 
     }
}
