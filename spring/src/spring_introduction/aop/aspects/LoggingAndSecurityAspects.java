package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspects {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice(): Log #10");
//    }
//
//




//   @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//}
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//
//   @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//    System.out.println("beforeGetLoggingAdvice: writing Log #1");
//}
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
//
//



//    @Pointcut("execution( * get*())")
//    private void allGetMethods(){}

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

       MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = "+ methodSignature);
        System.out.println("methodSignature.getMethod() = "+ methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+ methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+ methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("информация о книге: название - "+ myBook.getName()+
                            " ,автор - "+ myBook.getAuthor()+" , год издания - "+myBook.getYearOfPublication());

                }
                else if(obj instanceof String){
                    System.out.println("книгу в библиотеку добавляет: "+obj);
                }
            }

        }

        System.out.println("beforeGetLoggingAdvice: логирование " +"попытка получить книгу/журнал");
        System.out.println("------------------------------");
    }

//    @Before("execution( * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }
//@Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка на получение "+"книги/журнала");
//    }
}
