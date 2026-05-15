package org.example;
import java.util.ArrayList;
import java.util.List;


public class Result {
    private List<Integer> idPrzedmiotu = new ArrayList<>();
    private List<Integer> ilosci = new ArrayList<>();
    private int sumaWag;
    private int sumaWartosci;
    public Result(List<Integer> idPrzedmiotow, List<Integer> ilosci, int sumarycznaWaga, int sumarycznaWartosc) {
        this.idPrzedmiotu = idPrzedmiotow;
        this.ilosci = ilosci;
        this.sumaWag = sumarycznaWaga;
        this.sumaWartosci = sumarycznaWartosc;
    }
    @Override
    public String toString(){
        return "Wybrane \nId: "+idPrzedmiotu+"\nIlosc: "+ilosci+"\nSumaryczna Waga: "+sumaWag+"\tSuma Wartosic: "+sumaWartosci;
    }
    public List<Integer> getId(){
        return idPrzedmiotu;
    }
    public List<Integer> getIlosci(){
        return ilosci;
    }
    public int getSumaWag(){
        return sumaWag;
    }
    public int getSumaWartosci(){
        return sumaWartosci;
    }
}
