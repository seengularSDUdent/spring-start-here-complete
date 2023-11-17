package repositories;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment stored: " + comment.getText() + ", by: " + comment.getAuthor());
    }
}
