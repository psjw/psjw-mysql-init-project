package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;

//record jdk 16부터 공식기능 getter, setter 자동 사용
public record RegisterMemberCommand(
        String email,
        String nickname,
        LocalDate birthDay
) {
}
