package es.upm.miw.iwvg.ecosystem.practica;

public class User {
    private int age;

    private String name;

    private String familyName;

    public User(int age, String name, String familyName) {
        this.age = age;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
    }

    private String format(String string) {
        return string.trim().toUpperCase();
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String formalFullName() {
        return this.familyName + ", " + this.name;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

}
