package ru.maxvagan;

public class clsKogtewran extends clsHogwarts{
    private short smartness;
    private short wiseness;
    private short creativeness;

    public clsKogtewran(String studentName, String studentSurname, String nameOfFaculty, short magicPowerValue, short transgrationDistance, short smartness, short wiseness, short creativeness) {
        super(studentName, studentSurname, nameOfFaculty, magicPowerValue, transgrationDistance);
        this.smartness = smartness;
        this.wiseness = wiseness;
        this.creativeness = creativeness;
    }

    public int getSumOfPowerPoints() {
        return (int) smartness + wiseness + creativeness;
    }

    public short getSmartness() {
        return smartness;
    }

    public void setSmartness(short smartness) {
        this.smartness = smartness;
    }

    public short getWiseness() {
        return wiseness;
    }

    public void setWiseness(short wiseness) {
        this.wiseness = wiseness;
    }

    public short getCreativeness() {
        return creativeness;
    }

    public void setCreativeness(short creativeness) {
        this.creativeness = creativeness;
    }

    @Override
    public String toString() {
        return "clsKogtewran{" +
                "smartness=" + smartness +
                ", wiseness=" + wiseness +
                ", creativeness=" + creativeness +
                '}';
    }
}
