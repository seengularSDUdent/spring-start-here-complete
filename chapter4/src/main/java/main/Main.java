package main;

import config.SpringConfiguration;
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

        CommentService commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}