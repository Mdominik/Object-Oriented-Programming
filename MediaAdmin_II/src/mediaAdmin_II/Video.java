
package mediaAdmin_II;

public class Video extends Medium {
    int length;
    String producer;
    Video () {
        super();
    }
    Video (int len, String prod) {
        super();
        length = len;
        producer = prod;
    }
    
    
    void print() {
        System.out.print("Video by " + producer);
        super.print();
        System.out.println(", " + length + " minutes.");
    }
}


