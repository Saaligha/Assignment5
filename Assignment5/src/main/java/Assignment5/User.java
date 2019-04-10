package Assignment5;

import java.util.Set;

public class User {

    private String name, id, nationality, language;
    private int age;
    private Set<Course> course;

    private User() {

    }


    private static class Builder {
        private String name, id, nationality, language;
        private int age;
    }

    public Set<Course> getCourse() {
        return course;
    }


    public User setCourse(Set<Course> course) {
        this.course = course;
        return this;
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.language = builder.language;
        this.nationality = builder.nationality;
    }



    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public User setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public User setLanguage(String language) {
        this.language = language;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String name(String name) {
        return this.name = name;
    }

    public String id(String id) {
       return  this.id = id;
    }

    public String nationality(String nationality){
        return this.nationality = nationality;
    }

    public String language(String language){
        return this.language = this.language;
    }

    public int age(int age){
        return this.age = this.age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
