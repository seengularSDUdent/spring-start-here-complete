package main;

import config.SpringConfiguration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DatabaseCommentRepository;
import model.Comment;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Comment comment = new Comment("James", "Not bad!");

        CommentService commentServiceComponented = context.getBean("commentServiceComponented", CommentService.class);
        CommentService commentServiceBeanned = context.getBean("commentServiceBeanned", CommentService.class);

        commentServiceComponented.publishComment(comment);
        commentServiceBeanned.publishComment(comment);
    }
}

//When you'll use @Qualifier to give the name you use it only in places where you can select with annotation @Qualifier.
//It's possible to combine bean created in configuration file and bean created as component.
//Bean which is created in configuration class can take a name from name and value parameters of @Bean.
//Bean which is created as component can't take a name parameter of @Component name could be given only by value parameter.