
package mediaadmin;

public class MediaCopy {

    Medium theMedium; // a reference to a medium 
    // fill in the appropriate datatypes . . . 
            signature;  // a member that holds an integer value
            location;   // a reference to a String object

    // define a constructor that sets the values of 
    // the members signature and location 
    MediaCopy(int , String ) {


    }

    void print() {
        // print out the signature and the location
        System.out.print(" Copy signature: "  . . . 
        System.out.print(", location: "   . . . 
        // if this object contains reference to a medium-object (not null)
        // then call the print-method of the medium-object
        if . . .


        return;
    }

    boolean equals(MediaCopy otherCopy) { 
        // This method returns true if the members
        // of this object contain the same values
        // as the members of the other object. 
        // Otherwise it returns false. 

        // Hint: the clearest way is to test for inequality: 
        if ( . . .  !=  . . . ) {
            return false;
        }

        // Hint 2: location is of type String.
        // compare two string with location.equals( . . . )
         
        . . . 
        
        
        return . . . 
    }
}
