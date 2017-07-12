package pl.sdacademy.exceptions;

/**
 * Created by RENT on 2017-07-11.
 */
public class NoSuchPersonException extends Exception {
    private String name;
    private String surname;

    public NoSuchPersonException(String message, String name, String surname) {
        super(message);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
