package ru.maxvagan;

import java.util.function.Consumer;

public class Main {

    private static short setValue(){ return (short) Math.round(Math.random() * 100); }

    public static void main(String[] args) {
	    // Task 1
        System.out.println("Task 1");
        clsStudentCardInfo studentInfo = new clsStudentCardInfo();
        clsGriffindor harry = new clsGriffindor("Harry", "Potter", "Griffindor",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsGriffindor hermione = new clsGriffindor("Hermione", "Granger", "Griffindor",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsGriffindor ron = new clsGriffindor("Ron", "Weasley", "Griffindor",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsPuffendooy zachariah = new clsPuffendooy("Zachariah", "Smith", "Puffendooy",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsPuffendooy cedric = new clsPuffendooy("Cedric", "Diggory", "Puffendooy",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsPuffendooy justin = new clsPuffendooy("Justin", "Finch-Fletchley", "Puffendooy",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsKogtewran zhou = new clsKogtewran("Zhou", "Chang", "Kogtewran",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsKogtewran padma = new clsKogtewran("Padma", "Patil", "Kogtewran",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsKogtewran marcus = new clsKogtewran("Marcus", "Belby", "Kogtewran",
                setValue(), setValue(), setValue(), setValue(), setValue());
        clsSlizerent draco = new clsSlizerent("Draco", "Malfoy", "Slizerent",
                setValue(), setValue(), setValue(), setValue(), setValue(), setValue());
        clsSlizerent graham = new clsSlizerent("Graham", "Montague", "Slizerent",
                setValue(), setValue(), setValue(), setValue(), setValue(), setValue());
        clsSlizerent gregory = new clsSlizerent("Gregory", "Goyle", "Slizerent",
                setValue(), setValue(), setValue(), setValue(), setValue(), setValue());
        studentInfo.getFirstStudentOfFaculty(new clsGriffindor[]{harry, hermione, ron});
        System.out.println();
        studentInfo.getFirstStudentOfFaculty(new clsPuffendooy[]{zachariah, cedric, justin});
        System.out.println();
        studentInfo.getFirstStudentOfFaculty(new clsKogtewran[]{zhou, padma, marcus});
        System.out.println();
        studentInfo.getFirstStudentOfFaculty(new clsSlizerent[]{draco, graham, gregory});
        studentInfo.getWinner(harry, draco);
        studentInfo.getInfo(harry); studentInfo.getInfo(draco);
    }
}
