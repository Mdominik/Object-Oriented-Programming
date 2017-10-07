/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carheadlights;

public class LedHeadlight extends Headlight {

    public LedHeadlight(String lightType) {
        super(lightType);
    }

    public String getLightType() {
        return "LED-" + lightType;
    }
}
