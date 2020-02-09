package bg.pragmatic.homework.excel.model;

public class Job {

    private String name;
    private String profession;
    private String category;
    private int yearsОfЕxperience;

    public Job(String profession, String category, int yearsОfЕxperience, String name) {
        this.profession = profession;
        this.category = category;
        this.yearsОfЕxperience = yearsОfЕxperience;
        this.name=name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String job) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
