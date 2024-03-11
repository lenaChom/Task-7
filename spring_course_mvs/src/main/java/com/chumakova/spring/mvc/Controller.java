package com.chumakova.spring.mvc;

@org.springframework.stereotype.Controller
public class Controller {
    public String showFirstView(){
        @ReqestMapping
        return "first-view";
    }
}
