# Problem plecakowy – Java

Projekt w języku Java rozwiązujący problem plecakowy.

## Opis projektu

Program:
- generuje lub przyjmuje listę przedmiotów,
- każdy przedmiot posiada:
  - wagę,
  - wartość,
  - identyfikator,
- sortuje przedmioty według współczynnika wartość/waga,
- wybiera najlepsze przedmioty mieszczące się w zadanej pojemności plecaka,
- zwraca wynik zawierający:
  - wybrane przedmioty,
  - ilości,
  - sumaryczną wagę,
  - sumaryczną wartość.

## Struktura projektu

### `Main.java`
Klasa uruchamiająca program.

### `Problem.java`
Główna logika problemu plecakowego oraz algorytm zachłanny.

### `Przedmiot.java`
Model pojedynczego przedmiotu.

### `Result.java`
Przechowuje wynik działania algorytmu.

### `MainTest.java`
Testy jednostkowe napisane przy użyciu JUnit 5.

## Testy
Projekt zawiera testy sprawdzające:
- poprawną liczbę wygenerowanych przedmiotów,
- przypadek braku możliwych przedmiotów,
- poprawność ograniczeń wag i wartości,
- poprawność sum wag i wartości w wyniku.
