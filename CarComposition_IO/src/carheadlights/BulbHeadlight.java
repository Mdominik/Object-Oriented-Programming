/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carheadlights;

public class BulbHeadlight extends Headlight {

    public BulbHeadlight(String lightType) {
        super(lightType);
    }

    public String getLightType() {
        return "Bulb-" + lightType;
    }
}
