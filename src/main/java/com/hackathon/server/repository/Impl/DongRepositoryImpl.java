package com.hackathon.server.repository.Impl;


import com.hackathon.server.dto.DongRes;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.hackathon.server.domain.QDong.dong;
import static com.querydsl.core.group.GroupBy.groupBy;
import static com.querydsl.core.group.GroupBy.list;


@Repository
@RequiredArgsConstructor
public class DongRepositoryImpl implements DongRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<DongRes> selectAll() {
        return jpaQueryFactory.select(dong)
                .from(dong)
                .transform(groupBy(dong.dongId)
                        .list(Projections.constructor(
                                DongRes.class,
                                dong
                        )));
    }
}
