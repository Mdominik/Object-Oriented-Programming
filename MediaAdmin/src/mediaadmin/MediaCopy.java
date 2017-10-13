
package mediaadmin;

public class MediaCopy {

    Medium theMedium; // a reference to a medium 
    // fill in the appropriate datatypes . . . 
            int signature;  // a member that holds an integer value
            String location;   // a reference to a String object

    // define a constructor that sets the values of 
    // the members signature and location 
    MediaCopy(int sign, String loc) {
        signature = sign;
        location = loc;
    }

    void print() {
        // print out the signature and the location
        System.out.print(" Copy signature: " + this.signature);
        System.out.print(", location: " + this.location);
        // if this object contains reference to a medium-object (not null)
        // then call the print-method of the medium-object
        if(this != null) {
            this.print();
        }
    }

    boolean equals(MediaCopy otherCopy) { 
        // This method returns true if the members
        // of this object contain the same values
        // as the members of the other object. 
        // Otherwise it returns false. 

        // Hint: the clearest way is to test for inequality: 
        if (otherCopy.signature !=  this.signature || 
                otherCopy.location != this.location ) {
            return false;
        }
        return true;
    }
}
