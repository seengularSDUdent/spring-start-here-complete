package main;

import config.SpringConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Comment comment = new Comment("Nolan", "I like a juice.");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}