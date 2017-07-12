package pl.sdacademy.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by RENT on 2017-07-11.
 */
public class PersonList extends ArrayList<Person>{

//--- 3 ----
    public List<Person> findPersonWithAge(int age) throws IllegalArgumentException{
        if (age <0) {
            throw new IllegalArgumentException("Podany wiek powinien być wiekszy od 0");
        }
        return this.stream().filter(person -> person.getAge() == age).collect(Collectors.toList());
    }
    //---- 4 ----
    public Person getPerson(String name, String surname) throws NoSuchPersonException{
        Optional<Person> person = this.stream()
                .filter(person1 -> person1.getName() == name && person1.getSurname() == surname)
                .findFirst();
        if (!person.isPresent()) {
            throw new NoSuchPersonException(" ", name, surname);
        } else {
            return person.get();
        }
    }
}
