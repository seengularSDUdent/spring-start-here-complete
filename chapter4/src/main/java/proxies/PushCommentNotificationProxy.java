package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "PUSH")
public class PushCommentNotificationProxy implements CommentNotificationProxy{


    @Override
    public void sendComment(Comment comment) {
        System.out.println("Comment sent(push): " + comment.getText() + ", by: " + comment.getAuthor());
    }
}
