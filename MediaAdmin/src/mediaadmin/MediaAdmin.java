/*
 * To change this template, choose Tools | Templates
 * and open the template consoleInput the editor.
 */
package mediaadmin;

public class MediaAdmin {

    static MediaAdmin singleInstance;

    private MediaAdmin() {
    }

    public static void main(String[] args) {
        MediaAdmin mediaAdmin = getInstance();
        mediaAdmin.testMedium();
        mediaAdmin.testCopy();
        return;
    }
    
    void testMedium() {
        Medium aMedium_1 = new Medium(11, "aaa");
        Medium aMedium_2 = new Medium(11, "bbb");
        Medium aMedium_3 = new Medium(22, "aaa");
        Medium aMedium_4 = new Medium(11, "aaa");
        
        aMedium_1.print();
        System.out.println();

        System.out.println(" comparing media:");
        boolean comp = aMedium_1.equals(aMedium_2);
        System.out.println(" medium_1, medium_2: " + comp);
        comp = aMedium_2.equals(aMedium_3);
        System.out.println(" medium_4, medium_3: " + comp);
        comp = aMedium_1.equals(aMedium_4);
        System.out.println(" medium_1, medium_4: " + comp);

        return;
    }
    
    void testCopy() {
        MediaCopy aCopy_1 = new MediaCopy(321, "K102");
        MediaCopy aCopy_2 = new MediaCopy(432, "L028");
        MediaCopy aCopy_3 = new MediaCopy(321, "K102");

        System.out.println(" comparing copies:");
        boolean comp = aCopy_1.equals(aCopy_2);
        System.out.println(" copy_1, copy_2: " + comp);
        comp = aCopy_1.equals(aCopy_3);
        System.out.println(" copy_1, copy_3: " + comp);
        aCopy_1.theMedium = new Medium(11, "aaa");
        comp = aCopy_1.equals(aCopy_3);
        System.out.println(" copy_1, copy_3: " + comp);
        
        aCopy_3.print();
        System.out.println();
        aCopy_1.print();
        System.out.println();

        return;
    }
    
    static MediaAdmin getInstance() {
        if (singleInstance == null) {
            singleInstance = new MediaAdmin();
        }
        return singleInstance;
    }

    
}

