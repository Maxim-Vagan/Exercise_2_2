package ru.maxvagan;

public class clsHogwarts {

    private final String studentName;
    private final String studentSurname;
    private final String nameOfFaculty;
    private short magicPowerValue;
    private short transgressionDistance;

    public clsHogwarts(String studentName, String studentSurname, String nameOfFaculty, short magicPowerValue, short transgrationDistance) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.nameOfFaculty = nameOfFaculty;
        this.magicPowerValue = magicPowerValue;
        this.transgressionDistance = transgrationDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public short getMagicPowerValue() {
        return magicPowerValue;
    }

    public void setMagicPowerValue(short magicPowerValue) {
        this.magicPowerValue = magicPowerValue;
    }

    public short getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(short transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "clsHogwarts{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", nameOfFaculty='" + nameOfFaculty + '\'' +
                ", magicPowerValue=" + magicPowerValue +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
