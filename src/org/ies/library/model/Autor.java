package org.ies.library.model;

public class Autor {
    private String nif;
    private String name;
    private String surname;

    public Autor(String Nif, String name, String surname) {
        this.nif = Nif;
        this.name = name;
        this.surname = surname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}


