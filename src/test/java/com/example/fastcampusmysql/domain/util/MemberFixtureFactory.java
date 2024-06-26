package com.example.fastcampusmysql.domain.util;

import com.example.fastcampusmysql.domain.member.entity.Member;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

public class MemberFixtureFactory {

    static public Member create() {
        var param = new EasyRandomParameters()
                .stringLengthRange(1, 10);
        return new EasyRandom(param)

                .nextObject(Member.class);
    }

    static public Member create(Long seed) {
        var param = new EasyRandomParameters()
                .seed(seed)
                .stringLengthRange(1, 10);
        return new EasyRandom(param)
                .nextObject(Member.class);
    }
}
