package edu.example.springbootblog.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WebSingUpRequest { // 뷰 단에서, 회원가입시 보낼 정보들
    private String email;
    private String password;

}
