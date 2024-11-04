package apiTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApiTests {


    @Test
    public void apitest1() {
        System.out.println("Api Test");
    }

//    @Test
//    public void apitest2() {
//        open("https://duckduckgo.com");
//        $(By.name("q")).val("qq").pressEnter();
//
//    }
}
