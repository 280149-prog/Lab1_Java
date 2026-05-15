package org.example;
import java.util.List;
import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
            Problem pr1 = new Problem(10,7);
        Assertions.assertEquals(10,pr1.getSize());
    }
    @org.junit.jupiter.api.Test
    void atLeastOneItem() {
        Problem pr1 = new Problem(List.of(
                new Przedmiot(1, 5, 0),
                new Przedmiot(2, 8, 1),
                new Przedmiot(11, 10, 2)
        ));
        boolean atLeastOne = false;
        int capacity = 10;
        for(Przedmiot p: pr1.getPrzedmioty()){
            if (p.getWaga()<=capacity){
                atLeastOne = true;
                break;
            }
        }
        Result result = pr1.Solve(capacity);
        if (atLeastOne){
            Assertions.assertTrue(result.getId().size()>0);
        }
    }
    @org.junit.jupiter.api.Test
    void none(){
        Problem pr1 = new Problem(List.of(
                new Przedmiot(6, 5, 0),
                new Przedmiot(7, 8, 1),
                new Przedmiot(11, 10, 2)
        ));
        boolean none = true;
        int capacity = 5;
        for(Przedmiot p: pr1.getPrzedmioty()){
            if (p.getWaga()<=capacity){
                none = false;
                break;
            }
        }
        Result result = pr1.Solve(capacity);
        if (none){
            Assertions.assertTrue(result.getId().size()==0);
        }
        //System.out.println(pr1);
    }
    @org.junit.jupiter.api.Test
    void inBounds(){
        Problem pr1 = new Problem(List.of(
                new Przedmiot(6, 5, 0),
                new Przedmiot(7, 8, 1),
                new Przedmiot(1, 6, 2)
        ));
        pr1.setMax(10);
        pr1.setMin(1);
        boolean inBounds = true;
        for (Przedmiot p:pr1.getPrzedmioty()){
            if (pr1.getMax()<p.getWaga()||pr1.getMin()>p.getWaga()){
                inBounds = false;
            }else if (pr1.getMax()<p.getWartosc()||pr1.getMin()>p.getWartosc()){
                inBounds = false;
            }
        }
        Assertions.assertTrue(inBounds);
    }
    @org.junit.jupiter.api.Test
    void result(){
        Problem pr1 = new Problem(10, 7);
        int capacity = 10;
        Result result = pr1.Solve(capacity);
        int oczekiwanaWaga = 0;
        int oczekiwanaWartosc = 0;
        List<Integer> ids = result.getId();
        List<Integer> ilosci = result.getIlosci();

        for (int i = 0; i < ids.size(); i++) {
            Przedmiot p = pr1.getPrzedmioty().get(ids.get(i));
            oczekiwanaWaga += ilosci.get(i) * p.getWaga();
            oczekiwanaWartosc += ilosci.get(i) * p.getWartosc();
        }

        Assertions.assertEquals(oczekiwanaWaga, result.getSumaWag());
        Assertions.assertEquals(oczekiwanaWartosc, result.getSumaWartosci());

    }
}