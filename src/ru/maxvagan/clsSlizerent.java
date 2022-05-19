package ru.maxvagan;

public class clsSlizerent extends clsHogwarts{

    private short cunning;
    private short determination;
    private short ambition;
    private short lustForPower;

    public clsSlizerent(String studentName, String studentSurname, String nameOfFaculty, short magicPowerValue, short transgrationDistance, short cunning, short determination, short ambition, short lustForPower) {
        super(studentName, studentSurname, nameOfFaculty, magicPowerValue, transgrationDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.lustForPower = lustForPower;
    }

    public int getSumOfPowerPoints() {
        return (int) cunning + determination + ambition + lustForPower;
    }

    public short getCunning() {
        return cunning;
    }

    public void setCunning(short cunning) {
        this.cunning = cunning;
    }

    public short getDetermination() {
        return determination;
    }

    public void setDetermination(short determination) {
        this.determination = determination;
    }

    public short getAmbition() {
        return ambition;
    }

    public void setAmbition(short ambition) {
        this.ambition = ambition;
    }

    public short getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(short lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "clsSlizerent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
