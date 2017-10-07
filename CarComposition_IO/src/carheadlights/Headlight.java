/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carheadlights;

import java.io.Serializable;

public abstract class Headlight  implements Serializable {

    protected String lightType;

    Headlight(String lightType_) {
        lightType = lightType_;
    }

    abstract String getLightType();

    public void printHeadlight() {
        System.out.println("headlight: " + getLightType());
    }
}
