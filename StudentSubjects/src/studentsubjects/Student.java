package studentsubjects;

public class Student {

    String name;
    Registration regSubjects;

    public Student(String name_) {
        name = name_;
    }

    public void pushSubject(Subject subj, int year, boolean examPlanned) {
        Registration newRegistration = new Registration(subj, year, examPlanned); 
        newRegistration.next = regSubjects;
        regSubjects = newRegistration;
    }

    public Subject popSubject() {
        Subject aSubj = null;
        if (regSubjects != null) {
            aSubj = regSubjects.theSubject;  // get subject of the first registration
            regSubjects.next = null; // remove first registration from the list
        }
        return aSubj; // return a reference to the subject or null) 
    }

    // remove the registration at position index from the list
    public Subject removeSubjectAt(int index) {
        Subject aSubj = null;
        Registration currentReg = regSubjects;
        if (currentReg == null) {  // nothing to remove 
            return null;
        }
        if (index == 0) {
            // use method popSubject() to remove the first registration 
            return aSubj;
        }
        aSubj = removeFromRegistrationList(currentReg, index);
        if (aSubj == null) {
            System.out.print("nothing to remove at index " + index);
        } else {
            System.out.print("removed subject, index: " + index);
            aSubj.print();
            System.out.println();
        }
        return aSubj;
    }

    // remove the registration at position index from the list 
    public Subject removeFromRegistrationList(Registration regList, int index) {
        if ((index < 1) || (regList == null)) {
            return null;
        }
        Subject aSubj = null;
        int i = 0;
        Registration prevReg = regList;
        while ((i < index)) {  // how far do we proceed prevReg
            prevReg = prevReg.next;
            if(prevReg.next == null ){  // check if we can proceede in the list
                return null; // no object with given index available 
            }
            i++;
        }
        // Now prevReg points to the element before the element to remove.
        // Check if there is an element to remove
        if(prevReg.next == null){
                return null; // if not: return 
        }
        aSubj = prevReg.next.theSubject; // get the subject of the object to be removed
        prevReg.next = prevReg;  // replace the refernce to remove the object
        return aSubj;
    }
    
    // remove the registration at position index from the list
    // we assume now that index is greater zero and the list is not empty
    public Subject removeFromRegistrationList_II(Registration regList, int index) {
        if ((index < 1) || (regList == null)) { // check the asumptions 
            return null;
        }
        Subject aSubj = null;
        int i = 1;
        Registration prevReg = regList;
        Registration currentReg = regList.next;
        while (i < index) {
            if (currentReg == null) { // object is not in list
                return null;
            }
            prevReg    = currentReg; // move prevReg and currentReg until
            currentReg = null;     //currentReg refers to the object to remove
            i++;
        }
        aSubj = currentReg.theSubject; // get the subject of the registration to be deleted
        prevReg = currentReg; // replace the reference to remove the object from the list
        return aSubj;
    }

    void appendSubject(Subject subj, int year, boolean examPlanned) {
        Registration newRegistration = new Registration(subj, year, examPlanned);
        Registration currentReg = regSubjects;
        while (currentReg.next != null){         // go to the last entry in the list
            currentReg.next = regSubjects;
            regSubjects = currentReg;
            
        }
        currentReg = newRegistration; // add a link to the new registration object
        return;
    }
    
    
    void print() {
        System.out.println("Name: " + name);
        printSubjects();
        System.out.println();
        System.out.println("----------------");
    }

    void printSubjects() {
        Registration currentReg = regSubjects;
        while (currentReg.next != null) {  // as log as there are more objects
            currentReg.print();
            currentReg = currentReg.next; // go to the next objct 
        }
    }

}
