package ru.maxvagan;

public class clsGriffindor extends clsHogwarts {
    private short nobleness;
    private short honor;
    private short brave;

    public clsGriffindor(String studentName, String studentSurname, String nameOfFaculty, short magicPowerValue, short transgrationDistance, short nobleness, short honor, short brave) {
        super(studentName, studentSurname, nameOfFaculty, magicPowerValue, transgrationDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.brave = brave;
    }

    public int getSumOfPowerPoints() {
        return (int) nobleness + honor + brave;
    }

    public short getNobleness() {
        return nobleness;
    }

    public void setNobleness(short nobleness) {
        this.nobleness = nobleness;
    }

    public short getHonor() {
        return honor;
    }

    public void setHonor(short honor) {
        this.honor = honor;
    }

    public short getBrave() {
        return brave;
    }

    public void setBrave(short brave) {
        this.brave = brave;
    }

    @Override
    public String toString() {
        return "clsGriffindor{" +
                "nobleness=" + nobleness +
                ", honor=" + honor +
                ", brave=" + brave +
                '}';
    }
}
