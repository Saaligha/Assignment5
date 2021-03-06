package domain;

public class Nationality {


    private String nationality,language;

    private Nationality(){}

    public String getNationality(){
        return nationality;
    }

    public String getLan(){
        return language;
    }

    private Nationality(Builder builder){
     this.nationality = builder.nationality;
     this.language = builder.language;
    }

    public static class Builder{
        private String nationality, language;
    }

    public Nationality Nationality(String nationality){
        this.nationality = nationality;
        return this;
    }

    public Nationality language(String language){
        this.language = language;
        return this;
    }

    public Nationality build(){
        return new Nationality}(this);



}
