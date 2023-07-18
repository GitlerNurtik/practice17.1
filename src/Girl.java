public class Girl {
    private String name;
    private String surname;
    private int BirthYear;
    private String gender;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl:" +"\n"+
                "name:" + name +"\n"+
                " surname:" + surname +"\n"+
                " BirthYear:" + BirthYear +"\n"+
                " gender:" + gender +"\n"+
                " age:" + age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
