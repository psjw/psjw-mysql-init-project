package com.example.fastcampusmysql.domain.member.entity;

import com.example.fastcampusmysql.domain.util.MemberFixtureFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @DisplayName("회원은 닉네임을 변경할 수 있다.")
    @Test
    public void testChangeName(){
        var member = MemberFixtureFactory.create();
        var expected = "pnu";

        member.changeNickname(expected);
        Assertions.assertThat(member.getNickname()).isEqualTo(expected);
    }


    @DisplayName("회원의 닉네임은 10자를 초과할 수 없다.")
    @Test
    public void testNicknameMaxLength(){
        var member = MemberFixtureFactory.create();
        var overMaxLengthName = "pnupnupnupnu";
        Assertions.assertThatThrownBy(() -> {
            member.changeNickname(overMaxLengthName);
        }).isInstanceOf(IllegalArgumentException.class);

    }

}