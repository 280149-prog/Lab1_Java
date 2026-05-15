package org.example;

public class Przedmiot {
    private int waga;
    private int wartosc;
    private int id;
    public Przedmiot(int waga, int wartosc, int id){
        this.waga = waga;
        this.wartosc = wartosc;
        this.id = id;
    }
    public int getWaga(){
        return waga;
    }
    public int getWartosc(){
        return wartosc;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Id: "+ id +" waga: "+waga+" wartosc: "+wartosc+"\n";
    }
}
