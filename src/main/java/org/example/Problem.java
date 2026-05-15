package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem {
    private int numberOfTypes;
    private int seed;
    private int min, max;
    private List<Przedmiot> przedmioty =new ArrayList<>();
    private Random rand;
    public Problem(int n,int seed ){
        this.numberOfTypes = n;
        this.seed = seed;
        this.min = 1;
        this.max = 10;
        this.rand = new Random();
        for (int i = 0; i < n; i++) {
            int waga    = rand.nextInt(max - min + 1) + min;
            int wartosc = rand.nextInt(max - min + 1) + min;
            przedmioty.add(new Przedmiot(waga, wartosc, i));
        }
    }
    @Override
    public String toString(){
        return "Liczba typów " + numberOfTypes + "\n Przedmioty:\n" + przedmioty.toString();
    }
    public Problem(List<Przedmiot> przedmioty) {
        this.numberOfTypes = przedmioty.size();
        this.przedmioty = przedmioty;
    }
    public int getSize(){
        return numberOfTypes;
    }
    public Result Solve(int capacity){
        List<Przedmiot>posortowane = new ArrayList<>(przedmioty);
        posortowane.sort((a,b) -> Double.compare(
                (double) b.getWartosc()/b.getWaga(),
                (double) a.getWartosc()/a.getWaga()
        ));
        List<Integer> idPrzedmiotow = new ArrayList<>();
        List<Integer> ilosci = new ArrayList<>();
        int pozostalaWaga = capacity;
        int sumarycznaWartosc = 0;
        for (Przedmiot p : posortowane) {
            if (pozostalaWaga <= 0) break;

            int ile = pozostalaWaga / p.getWaga();

            if (ile > 0) {
                idPrzedmiotow.add(p.getId());
                ilosci.add(ile);
                pozostalaWaga -= ile * p.getWaga();
                sumarycznaWartosc += ile * p.getWartosc();
            }
        }
        return new Result(idPrzedmiotow, ilosci, capacity-pozostalaWaga, sumarycznaWartosc);
    }
    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }
    public int getMin() {
        return min;
    }
    public int getMax(){
        return max;
    }
    public void setMin(int m){
        this.min=m;
    }
    public void setMax(int m){
        this.max=m;
    }
}
