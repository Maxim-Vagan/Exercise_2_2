package ru.maxvagan;

public class clsPuffendooy extends clsHogwarts {
    private short industriousness;
    private short loyalty;
    private short honesty;

    public clsPuffendooy(String studentName, String studentSurname, String nameOfFaculty, short magicPowerValue, short transgrationDistance, short industriousness, short loyalty, short honesty) {
        super(studentName, studentSurname, nameOfFaculty, magicPowerValue, transgrationDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getSumOfPowerPoints() {
        return (int) industriousness + loyalty + honesty;
    }

    public short getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(short industriousness) {
        this.industriousness = industriousness;
    }

    public short getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(short loyalty) {
        this.loyalty = loyalty;
    }

    public short getHonesty() {
        return honesty;
    }

    public void setHonesty(short honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "clsPuffendooy{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
