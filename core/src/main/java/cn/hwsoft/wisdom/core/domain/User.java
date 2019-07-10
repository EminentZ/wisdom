package cn.hwsoft.wisdom.core.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private Integer id;

    private String identity;

    private String nickname;

    private String realname;

    private String password;

    private Integer phone;

    private String cover;

    private String address;

    private Byte status;

    private Integer create_time;

    private Integer update_time;

}