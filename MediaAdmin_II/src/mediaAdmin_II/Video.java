
package mediaAdmin_II;

public class Video extends Medium {
    int length;
    String producer;
    Video (int len, String prod) {
        super();
        length = len;
        producer = prod;
    }
    
    @Override
    void print() {
        System.out.println("length: " + length);
        System.out.println(", producer: " + producer);
    }
}


