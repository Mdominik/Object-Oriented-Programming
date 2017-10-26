/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsubjects;

public class Registration {

    Subject theSubject;
    int year;
    boolean examPlanned;
    Registration next;

    Registration(Subject subj, int regYear, boolean examPlanned_) {
        theSubject = subj; 
        year = regYear;
        examPlanned = examPlanned_;
    }

    void print() {
        System.out.print("Registration: ");
        theSubject.print();
        System.out.print("   Year: " + year);
        System.out.print("   Exam: " + examPlanned);
        System.out.println();
    }

}
