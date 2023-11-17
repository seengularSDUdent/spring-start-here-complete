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