package ru.maxvagan;

public class clsStudentCardInfo {

    public void getInfo(clsGriffindor student) {
        String infoCard = "Student of Hogwarts School\r\n" +
                "----------- +++ ----------\r\n" +
                "Name:    " + student.getStudentName() + "\r\n" +
                "Surname: " + student.getStudentSurname() + "\r\n" +
                "Faculty: " + student.getNameOfFaculty() + "\r\n" +
                "Magic Power:   " + student.getMagicPowerValue() + "\r\n" +
                "Transgression: " + student.getTransgressionDistance() + "\r\n" +
                "~~~~~~~~~ Specialties ~~~~~~~~~" +"("+ student.getSumOfPowerPoints() +")" + "\r\n" +
                "Nobleness: " + student.getNobleness() +
                "; Honor: " + student.getHonor() +
                "; Brave: " + student.getBrave() + "\r\n";
        System.out.println(infoCard);
    }

    public void getInfo(clsPuffendooy student) {
        String infoCard = "Student of Hogwarts School\r\n" +
                "----------- +++ ----------\r\n" +
                "Name:    " + student.getStudentName() + "\r\n" +
                "Surname: " + student.getStudentSurname() + "\r\n" +
                "Faculty: " + student.getNameOfFaculty() + "\r\n" +
                "Magic Power:   " + student.getMagicPowerValue() + "\r\n" +
                "Transgression: " + student.getTransgressionDistance() + "\r\n" +
                "~~~~~~~~~ Specialties ~~~~~~~~~"+"("+ student.getSumOfPowerPoints() +")" + "\r\n" +
                "Industriousness: " + student.getIndustriousness() +
                "; Loyalty: " + student.getLoyalty() +
                "; Honesty: " + student.getHonesty() + "\r\n";;
        System.out.println(infoCard);
    }

    public void getInfo(clsKogtewran student) {
        String infoCard = "Student of Hogwarts School\r\n" +
                "----------- +++ ----------\r\n" +
                "Name:    " + student.getStudentName() + "\r\n" +
                "Surname: " + student.getStudentSurname() + "\r\n" +
                "Faculty: " + student.getNameOfFaculty() + "\r\n" +
                "Magic Power:   " + student.getMagicPowerValue() + "\r\n" +
                "Transgression: " + student.getTransgressionDistance() + "\r\n" +
                "~~~~~~~~~ Specialties ~~~~~~~~~"+"("+ student.getSumOfPowerPoints() +")" + "\r\n" +
                "Smartness: " + student.getSmartness() +
                "; Wiseness: " + student.getWiseness() +
                "; Creativeness: " + student.getCreativeness() + "\r\n";;
        System.out.println(infoCard);
    }

    public void getInfo(clsSlizerent student) {
        String infoCard = "Student of Hogwarts School\r\n" +
                "----------- +++ ----------\r\n" +
                "Name:    " + student.getStudentName() + "\r\n" +
                "Surname: " + student.getStudentSurname() + "\r\n" +
                "Faculty: " + student.getNameOfFaculty() + "\r\n" +
                "Magic Power:   " + student.getMagicPowerValue() + "\r\n" +
                "Transgression: " + student.getTransgressionDistance() + "\r\n" +
                "~~~~~~~~~ Specialties ~~~~~~~~~"+"("+ student.getSumOfPowerPoints() +")" + "\r\n" +
                "Cunning: " + student.getCunning() +
                "; Determination: " + student.getDetermination() +
                "; Ambition: " + student.getAmbition() +
                "; Lust For Power: " + student.getLustForPower() + "\r\n";;
        System.out.println(infoCard);
    }

    public void getFirstStudentOfFaculty(clsGriffindor[] inpStudents) {
        int sumSkillPoints = 0;
        int firstPlace = 0; int secondPlace = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints){
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                firstPlace = i;
            }
        }
        while (secondPlace == firstPlace) secondPlace += 1;
        sumSkillPoints = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints && i != firstPlace) {
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                secondPlace = i;
            }
        }
        System.out.printf("Best student of Griffindor is %s %s\r\nSecond place has %s %s\r\n%s - %s\r\n%s - %s\r\n",
                inpStudents[firstPlace].getStudentName(),
                inpStudents[firstPlace].getStudentSurname(),
                inpStudents[secondPlace].getStudentName(),
                inpStudents[secondPlace].getStudentSurname(),
                inpStudents[firstPlace].getStudentName(), inpStudents[firstPlace],
                inpStudents[secondPlace].getStudentName(), inpStudents[secondPlace]);
    }

    public void getFirstStudentOfFaculty(clsPuffendooy[] inpStudents) {
        int sumSkillPoints = 0;
        int firstPlace = 0; int secondPlace = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints){
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                firstPlace = i;
            }
        }
        while (secondPlace == firstPlace) secondPlace += 1;
        sumSkillPoints = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints && i != firstPlace) {
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                secondPlace = i;
            }
        }
        System.out.printf("Best student of Puffendooy is %s %s\r\nSecond place has %s %s\r\n%s - %s\r\n%s - %s\r\n",
                inpStudents[firstPlace].getStudentName(),
                inpStudents[firstPlace].getStudentSurname(),
                inpStudents[secondPlace].getStudentName(),
                inpStudents[secondPlace].getStudentSurname(),
                inpStudents[firstPlace].getStudentName(), inpStudents[firstPlace],
                inpStudents[secondPlace].getStudentName(), inpStudents[secondPlace]);
    }

    public void getFirstStudentOfFaculty(clsKogtewran[] inpStudents) {
        int sumSkillPoints = 0;
        int firstPlace = 0; int secondPlace = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints){
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                firstPlace = i;
            }
        }
        while (secondPlace == firstPlace) secondPlace += 1;
        sumSkillPoints = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints && i != firstPlace) {
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                secondPlace = i;
            }
        }
        System.out.printf("Best student of Kogtewran is %s %s\r\nSecond place has %s %s\r\n%s - %s\r\n%s - %s\r\n",
                inpStudents[firstPlace].getStudentName(),
                inpStudents[firstPlace].getStudentSurname(),
                inpStudents[secondPlace].getStudentName(),
                inpStudents[secondPlace].getStudentSurname(),
                inpStudents[firstPlace].getStudentName(), inpStudents[firstPlace],
                inpStudents[secondPlace].getStudentName(), inpStudents[secondPlace]);
    }

    public void getFirstStudentOfFaculty(clsSlizerent[] inpStudents) {
        int sumSkillPoints = 0;
        int firstPlace = 0; int secondPlace = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints){
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                firstPlace = i;
            }
        }
        while (secondPlace == firstPlace) secondPlace += 1;
        sumSkillPoints = 0;
        for (int i = 0; i < inpStudents.length; i++) {
            if (inpStudents[i].getSumOfPowerPoints() >= sumSkillPoints && i != firstPlace) {
                sumSkillPoints = inpStudents[i].getSumOfPowerPoints();
                secondPlace = i;
            }
        }
        System.out.printf("Best student of Slizerent is %s %s\r\nSecond place has %s %s\r\n%s - %s\r\n%s - %s\r\n",
                inpStudents[firstPlace].getStudentName(),
                inpStudents[firstPlace].getStudentSurname(),
                inpStudents[secondPlace].getStudentName(),
                inpStudents[secondPlace].getStudentSurname(),
                inpStudents[firstPlace].getStudentName(), inpStudents[firstPlace],
                inpStudents[secondPlace].getStudentName(), inpStudents[secondPlace]);
    }

    public void getWinner(clsHogwarts student1, clsHogwarts student2) {
        System.out.printf("~+~+~+~+~ %s %s  vs  %s %s ~+~+~+~+~\r\n",
                student1.getStudentName(),
                student1.getStudentSurname(),
                student2.getStudentName(),
                student2.getStudentSurname());
        if (student1.getMagicPowerValue() > student2.getMagicPowerValue())
            System.out.println(student1.getStudentName() + " has bigger magic power then " + student2.getStudentName());
        else System.out.println(student2.getStudentName() + " has bigger magic power then " + student1.getStudentName());
        if (student1.getTransgressionDistance() > student2.getTransgressionDistance())
            System.out.println(student1.getStudentName() + " has longer transgression path then " + student2.getStudentName());
        else System.out.println(student2.getStudentName() + " has longer transgression path then " + student1.getStudentName());
    }
}
