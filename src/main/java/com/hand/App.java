package com.hand;

import com.hand.dto.Film;
import com.hand.service.FilmService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Properties properties = new Properties();
        properties.load(App.class.getClassLoader().getResourceAsStream("dbconfig.properties"));

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        System.out.println(properties.get("app.start").toString());
        FilmService filmService = (FilmService) context.getBean("filmService");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("请输入电影名称(title): ");
            String title = input.next();

            System.out.println("请输入电影描述(description): ");
            String description = input.next();

            System.out.println("请输入语言 ID(language_id): ");
            int languageId = input.nextInt();

            Film film = new Film(title,description,languageId);
            int count = filmService.insert(film);
            if(count > 0) {
                System.out.println("插入成功！");
            } else {
                System.out.println("插入失败！");
            }

            System.out.println(properties.get("app.end").toString());
        }
    }
}
