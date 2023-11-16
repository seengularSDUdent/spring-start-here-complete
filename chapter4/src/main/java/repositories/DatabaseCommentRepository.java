package repositories;

import model.Comment;
public class DatabaseCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment stored: " + comment.getText() + ", by: " + comment.getAuthor());
    }
}
