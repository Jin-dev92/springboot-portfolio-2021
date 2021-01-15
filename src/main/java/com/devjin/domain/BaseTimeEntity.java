package com.devjin.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // entity 클래스들이 baseTimeEntity를 상속 할 경우 생성일, 수정일도 컬럼으로 인식해줌
@EntityListeners(AuditingEntityListener.class) // 이 클래스에 Auditing 기능 추가
public class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
