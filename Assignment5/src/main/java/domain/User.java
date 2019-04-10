package domain;

import javafx.util.Builder;

public class User {

    private String id, name;


    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }


    private User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;

    }

    public class Builder{

        private String name, id;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

    }

}
