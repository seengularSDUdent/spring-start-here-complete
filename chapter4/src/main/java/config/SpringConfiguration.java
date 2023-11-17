package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = {"proxies", "repositories", "services"})
public class SpringConfiguration {

    @Bean(name = "commentServiceBeanned")
    CommentService commentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy){
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        return commentService;
    }

//    @Bean(value = "commentServiceComponented")
//    CommentService commentService0(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy){
//        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
//
//        return  commentService;
//    }
}
