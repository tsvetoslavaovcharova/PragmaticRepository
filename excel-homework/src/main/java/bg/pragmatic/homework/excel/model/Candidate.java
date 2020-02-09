package bg.pragmatic.homework.excel.model;

public class Candidate {

    private String firstName;
    private String lastName;
    private int age;
    private String mobilePhone;
    private String profession;
    private String category;
    private int yearsОfЕxperience;

    public Candidate(String firstName, String lastName, int age, String mobilePhone, String profession, String category, int yearsОfЕxperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobilePhone = mobilePhone;
        this.profession = profession;
        this.category = category;
        this.yearsОfЕxperience = yearsОfЕxperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYearsОfЕxperience() {
        return yearsОfЕxperience;
    }

    public void setYearsОfЕxperience(int yearsОfЕxperience) {
        this.yearsОfЕxperience = yearsОfЕxperience;
    }
}
