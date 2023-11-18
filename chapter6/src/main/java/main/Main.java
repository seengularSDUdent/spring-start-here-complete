package main;

import config.SpringConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        Comment comment = new Comment("Nolan", "I like a juice.");

        CommentService commentService = context.getBean(CommentService.class);
        String value = commentService.publishComment(comment);

        logger.info(value);
    }
}