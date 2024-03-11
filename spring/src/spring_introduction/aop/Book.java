package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Book {
    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }


    public String getAuthor() {
        return author;
    }

    @Value("1897")
    private int yearOfPublication;


    @Value("Достоевский")
    private String author;


    @Value("Красная шапочка")
    private String name;
}
