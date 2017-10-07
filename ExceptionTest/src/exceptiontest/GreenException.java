
package exceptiontest;

public class GreenException extends BlueException {
    float exValue; 
    
    GreenException(float value){
        super((int)value);
        exValue = value;
    }
    
}
