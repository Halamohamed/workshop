package se.ceutbildning.hala;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class Prgrammer {
    private String id;
    private String name;
    private LocalDate birthDate;
    private String[] certificates;
    private String[] skills;

    public Prgrammer(String id, String name, LocalDate birthDate, String[] certificates, String[] skills) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.certificates = certificates;
        this.skills = skills;
        System.out.println("konstruktor 1 anropad");
    }
    public Prgrammer(String name, LocalDate birthDate){
        this(UUID.randomUUID().toString(), name, birthDate, new String[0], new String[0]);
        System.out.println("konstruktor 2 anropad");
    }
    public Prgrammer(LocalDate birthDate){
        this("Not specified", birthDate);
        System.out.println("konstruktor 3 anropad");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Prgrammer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", certificates=" + Arrays.toString(certificates) +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
