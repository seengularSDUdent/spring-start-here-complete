package main;

import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DatabaseCommentRepository;
import model.Comment;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentRepository commentRepository = new DatabaseCommentRepository();

        Comment comment = new Comment("James", "Not bad!");

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        commentService.publishComment(comment);
    }
}