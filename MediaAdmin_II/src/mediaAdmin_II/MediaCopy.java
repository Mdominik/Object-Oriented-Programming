/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaAdmin_II;

public class MediaCopy {
    Medium theMedium;
    int signature;
    String location; 
    
    MediaCopy(int mediumId, int signature_, String location_){
        MediaAdministration mediaAdmin = MediaAdministration.getMediaAdministration(); 
        theMedium = mediaAdmin.getMedium(mediumId);
        signature = signature_;
        location = location_; 
    }
    
       MediaCopy(int signature_, String location_){
        signature = signature_;
        location = location_; 
    }
    
    void print(){
        System.out.print(" Copy signature: " + signature);
        System.out.print(", location: " + location);
        if (theMedium != null){
            theMedium.print();
        }
        return; 
    }
    
    boolean equals(MediaCopy otherCopy){
        if(theMedium != otherCopy.theMedium){
            return false;
        }
        if(signature != otherCopy.signature){
            return false;
        }
        if(!location.equals(otherCopy.location)){
            return false;
        }
        return true; 
    }
}
