package com.example.OAuthJWT.dto;

public interface OAuth2Response {

    // 제공자 (EX. naver, google, kakao, ...)
    String getProvider();

    // 제공자에서 발급해주는 아이디
    String getProviderId();

    // 이메일
    String getEmail();

    // 사용자 실명 (설정한 이름)
    String getName();
}
