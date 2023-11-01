package data;

public class Employee {
    int tabelNumber;
    String phoneNumber;
    String name;
    int experience;

    public Employee(int tabel, String phone, String name, int experience) {
        this.tabelNumber = tabel;
        this.phoneNumber = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getTabelNumber() {
        return tabelNumber;
    }

    public void setTabelNumber(int tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee (" +
                "таб.№ =" + tabelNumber +
                ", имя ='" + name + '\'' +
                ", тел.номер ='" + phoneNumber + '\'' +
                ", стаж =" + experience +
                ')';
    }
}
