/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaadmin;

public class Medium {

    int id;
    String title;

    // define a constructor that sets the values of 
    // the members id and title
    Medium(int nId, String nTitle) {
        id = nId;
        title = nTitle;
    }

    void print() {
        // print out the id and the title
        System.out.print(" Medium, id:" + getId());
        System.out.print(", title: " + getTitle()); 
    }
    
    int getId() {
        return id;
    }
    void setId(int nId) {
        id = nId;
    }
    
    String getTitle() {
        return title;
    }
    void setTitle(String nTitle) {
        title = nTitle;
    }
    
    boolean equals(Medium otherMedium){
        // This method returns true if the members
        // of this object hold the same values
        // as the members of the other object. 
        // Otherwise it returns false. 

        // Hint: the clearest way is to test for inequality: 
        if (otherMedium.getTitle() !=  this.getTitle() || 
                otherMedium.getId()!= this.getId() ) {
            return false;
        }
        return true;
    }

}
