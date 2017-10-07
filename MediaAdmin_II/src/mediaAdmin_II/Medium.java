/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaAdmin_II;

import java.text.*;
import java.util.*;

public class Medium {

    int id;
    String title;

    Medium() {

    }

    Medium(int id_, String title_) {
        id = id_;
        title = title_;
    }

    void print() {
        System.out.print(" Medium, id: " + id);
        System.out.print(", title: " + title);
    }

    boolean equals(Medium otherMedium) {
        if (id != otherMedium.id) {
            return false;
        }
        if (!title.equals(otherMedium.title)) {
            return false;
        }
        return true;
    }

}
