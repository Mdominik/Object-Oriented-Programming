package studentsubjects;

public class StudentSubjects {

    private static final int subCount = 4;
    private static Subject[] subjects = new Subject[subCount];

    public static void main(String[] args) {
        int i;
        for (i = 0; i < subCount; i++) {
            subjects[i] = Subject.createRandomSubject();
        }

        Student aStudent = new Student("Ben");
        int studSubCnt = (int) Math.round(Math.random() * subCount);
        for (i = 0; i < studSubCnt; i++) {
            int year = (int) Math.round(Math.random() * 3) + 2010;
            aStudent.pushSubject(subjects[i], year, true);
        }
        aStudent.print();
        
        Subject aSubj = aStudent.removeSubjectAt(subCount);
        aSubj = aStudent.removeSubjectAt(subCount - 1);
        aSubj = aStudent.removeSubjectAt(1);
        aSubj = aStudent.removeSubjectAt(0);
        
        aStudent.print();
        
        aStudent.appendSubject(subjects[0], 333, false);
        aStudent.print();
        
    }

}
