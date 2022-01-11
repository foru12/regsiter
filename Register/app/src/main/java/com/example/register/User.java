package com.example.register;

public class User {
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return Password;
    }

    public String getEdName() {
        return edName;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public String getNum() {
        return Num;
    }

    public String getTVFDATE() {
        return TVFDATE;
    }

    public String id,name,Password,edName,placeofbirth,Num,TVFDATE;

    public User(String id, String name, String password, String edName, String placeofbirth, String Num, String TVFDATE) {
        this.id = id;
        this.name = name;
        this.Password = password;
        this.edName = edName;
        this.placeofbirth = placeofbirth;
        this.Num = Num;
        this.TVFDATE = TVFDATE;
    }
}

