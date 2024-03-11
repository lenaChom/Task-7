package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
//    @Override
    public void getBook(){
        System.out.println("мы берём книгу из UniLibrary ");
        System.out.println("------------------------------");
    }

    public void returnBook(){
        System.out.println("мы возвращаем книгу в UniLibrary");
        System.out.println("------------------------------");
    }

    public void getMagazine(){
        System.out.println("мы берём журнал из UniLibrary");
        System.out.println("------------------------------");
    }

    public void returnMagazine(){
        System.out.println("мы возвращаем в UniLibrary");
        System.out.println("------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("мы добавляем книгу в UniLibrary ");
        System.out.println("------------------------------");
    }

    public void addMagazine(){
        System.out.println("мы добавляем журнал в UniLibrary");
        System.out.println("------------------------------");
    }
}
