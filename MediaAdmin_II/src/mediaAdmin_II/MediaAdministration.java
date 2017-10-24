package mediaAdmin_II;

import java.util.Scanner;
import java.util.HashMap;

public class MediaAdministration {

    Scanner consoleInput;
    // define a member mediaMap, a HashMap with
    // key type Integer and value type Medium 
    . . . . .  mediaMap;
    // define a member copyMap, a HashMap with
    // key type Integer and value type MediaCopy 
    . . . . . . copyMap;
    static MediaAdministration singleInstance;

    private MediaAdministration() {
        consoleInput = new Scanner(System.in);
        mediaMap = . . . . . ;
        copyMap = . . . . . . ;
    }

    public static void main(String[] args) {
        MediaAdministration mediaAdmin = getMediaAdministration();
        mediaAdmin.testMediumCopy();
        mediaAdmin.manageMedia();
        return;
    }

    void manageMedia() {
        boolean working = true;
        while (working) {
            System.out.print("m (medium) or c (copy) or q (quit): ");
            char command = consoleInput.next().charAt(0);
            switch (command) {
                case 'm':
                    processMedium();
                    break;
                case 'c':
                    processCopy();
                    break;
                case 'q':
                    working = false;
                default:
                    printChoices();
            }
            System.out.println();
        }
    }

    void processMedium() {
        System.out.print("medium command (b, v, p, a, ?): ");
        char command = consoleInput.next().charAt(0);
        switch (command) {
            case 'b':
                createBook();
                break;
            case 'v':
                createVideo();
                break;
            // case 'd':
            //     deleteMedium();
            //     break;
            case 'p':
                printMedium();
                break;
            case 'a':
                printAllMedia();
                break;

            default:
                printMediumCommands();
        }
    }
    
    void readMediumData(Medium newMedium) {
        System.out.print("media id: ");
        newMedium.id = consoleInput.nextInt();
        System.out.print("  media title: ");
        newMedium.title = consoleInput.next();
        return;
    }

    void createBook() {
        Book aBook = new Book();
        readMediumData(aBook);
        System.out.print("  author: ");
        aBook.setAuthor(consoleInput.next());
        System.out.print("  number of pages: ");
        aBook.numberOfPages = consoleInput.nextInt();
        mediaMap.put(aBook.id, aBook);
        // System.out.println();
        return;
    }

    void createVideo() {
        Video aVideo = new Video();
        readMediumData(aVideo);
        System.out.print("  producer: ");
        aVideo.producer = consoleInput.next();
        System.out.print("  length: ");
        aVideo.length = consoleInput.nextInt();
        mediaMap.put(aVideo.id, aVideo);
        // System.out.println();
        return;
    }

    void deleteMedium() {
        System.out.print("deletion of a medium is not supported ");
        return;
    }

    void printAllMedia() {
        // get a collection from mediaMap
        // and iterate over this collectin using the new for . . . 
        for (Medium m . . . . . . . ) {
            m.print();
        }
    }

    void printMedium() {
        System.out.print("print, media id: ");
        int id = consoleInput.nextInt();
        Medium aMedium = mediaMap.get(id);
        if (aMedium != null) {
            aMedium.print();
        } else {
            System.out.print("no such medium");
        }
        System.out.println();
        return;
    }

    void processCopy() {
        System.out.print("copy command (n, d, p, a, ?): ");
        char command = consoleInput.next().charAt(0);
        switch (command) {
            case 'n':
                createCopy();
                break;
            case 'd':
                deleteCopy();
                break;
            case 'p':
                printCopy();
                break;
            case 'a':
                printAllCopies();
                break;
            default:
                printCopyCommands();
        }
    }
    
    void createCopy() {
        System.out.print("media id for copy (int): ");
        int id = consoleInput.nextInt();
        System.out.print("copy signature (int): ");
        int signature = consoleInput.nextInt();
        System.out.print("copy location (String): ");
        String location = consoleInput.next();
        MediaCopy aCopy = new MediaCopy(id, signature, location);
        copyMap.put(aCopy.signature, aCopy);
        System.out.println();
        return;
    }

    void deleteCopy() {
        System.out.print("copy signature (int): ");
        int signature = consoleInput.nextInt();
        copyMap.remove(signature);
    }

    void printCopy() {
        System.out.print("print, copy signature (int): ");
        int signature = consoleInput.nextInt();
        MediaCopy aCopy = copyMap.get(signature);
        if (aCopy != null) {
            aCopy.print();
        } else {
            System.out.print("no such copy");
        }
        System.out.println();
        return;
    }

    void printAllCopies() {
        // get a collection from copyMap
        // and iterate over this collectin using the new for . . . 
        for (MediaCopy mc . . . . . ) {
            mc.print();
        }
    }
    
    void printChoices() {
        System.out.println(" Choices are: ");
        System.out.println("   m (medium)");
        System.out.println("   c (copy)");
    }

    void printMediumCommands() {
        System.out.println(" Commands are: ");
        System.out.println("   b (new book)");
        System.out.println("   v (new video)");
        // System.out.println("   d (delete)");
        System.out.println("   p (print a single medium)");
        System.out.println("   a (print all media)");
        System.out.println("   ? (print this message)");
    }
    
    void printCopyCommands() {
        System.out.println(" Commands are: ");
        System.out.println("   n (new copy)");
        System.out.println("   d (delete a copy)");
        System.out.println("   p (print a single copy)");
        System.out.println("   a (print all copies)");
        System.out.println("   ? (print this message)");
    } 

    Medium getMedium(int id) {
        return mediaMap.get(id);
    }

    static MediaAdministration getMediaAdministration() {
        if (singleInstance == null) {
            singleInstance = new MediaAdministration();
        }
        return singleInstance;
    }

    void testMediumCopy() {
        Medium aMedium_1 = new Medium(11, "aaa");
        Medium aMedium_2 = new Medium(11, "bbb");
        Medium aMedium_3 = new Medium(22, "aaa");
        Medium aMedium_4 = new Medium(11, "aaa");
        System.out.println(" comparing media:");
        boolean comp = aMedium_1.equals(aMedium_2);
        System.out.println("medium_1, medium_2: " + comp);
        comp = aMedium_2.equals(aMedium_3);
        System.out.println("medium_4, medium_3: " + comp);
        comp = aMedium_1.equals(aMedium_4);
        System.out.println("medium_1, medium_4: " + comp);

        MediaCopy aCopy_1 = new MediaCopy(321, "K102");
        MediaCopy aCopy_2 = new MediaCopy(432, "L028");
        MediaCopy aCopy_3 = new MediaCopy(321, "K102");

        comp = aCopy_1.equals(aCopy_2);
        System.out.println("copy_1, copy_2: " + comp);
        comp = aCopy_1.equals(aCopy_3);
        System.out.println("copy_1, copy_3: " + comp);
        aCopy_1.theMedium = aMedium_1;
        comp = aCopy_1.equals(aCopy_3);
        System.out.println("copy_1, copy_3: " + comp);

    }

}

