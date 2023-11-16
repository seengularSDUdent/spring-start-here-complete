package proxies;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment){
        System.out.println("Comment sent: " + comment.getText() + ", by: " + comment.getAuthor());
    }
}
