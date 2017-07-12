package pl.sdacademy.exceptions;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RENT on 2017-07-11.
 */
public class Main {
    public static void main(String[] args) {
       /* int[] intArray = new int[3];
        try {
            System.out.println(intArray[17]);
            int a = 5/0;
        } catch(IndexOutOfBoundsException e){
            System.out.println("Tresc wiadomosci wyjatku ArrayIndexOutOfBoundsException "
                    + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Tresc wiadomosci wyjatku ArithmeticException "
                    + e.getMessage());
        }
        System.out.println("ABC");
        try {
            Files.lines(Paths.get("abc.txt"));
        } catch (IOException e) {
            System.out.println("Nie udało sie odczytac pliku: " +e.getMessage());
            //e.printStackTrace();
        }*/



        System.out.println(divide(12, 0));

        int[] array = new int[] {21, 3 ,0};
        System.out.println(divideTwoArrayElements(array, 0,1));

        PersonList personList = new PersonList();
        personList.add(new Person("Ads", "asds", 14, 1.5f, "asd"));
        personList.add(new Person("Ads", "asds", 17, 1.8f, "asd1"));
        personList.add(new Person("Cdd", "ADX", 16, 1.9f, "asd2"));

        try {
            System.out.println(personList.findPersonWithAge(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(personList.getPerson("asd", "ADX"));
        } catch (NoSuchPersonException e){
            System.out.println("Nie znaleziono osoby imie=" + e.getName()+ " nazwisko=" + e.getSurname());
        }
    }

    public static Integer divide(int number1, int number2) {
        try {
            return number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero");
            return null;
        }

    }

    public static Integer divideTwoArrayElements(int[] intArray, int firstEleIndex, int secondEleIndex) {
        try {
            return intArray[firstEleIndex] / intArray[secondEleIndex];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index poza zadkesem tablicy " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero");
        }
        return null;
    }
}
