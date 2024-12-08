package edu.example.springbootblog.Blog.dto.apidto;

import edu.example.springbootblog.Blog.domain.Blog;
import lombok.Getter;

@Getter
public class BlogResponse {

    private final String title;
    private final String content;

    public BlogResponse(Blog blog) {
        // 엔티티를 인수로 받는 생성자
        this.title = blog.getTitle();
        this.content = blog.getContent();
    }
}
// 응답을 위한 dto 코드
// dto 코드는 응답을 위한 (통신에 사용되기에) 컨트롤러 <-> 서비스(비즈니스계층) <-> 퍼시스턴스계층 다 쓰임
