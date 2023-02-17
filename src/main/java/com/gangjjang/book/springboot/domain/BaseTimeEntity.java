package com.gangjjang.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
//JPA Entity클레스들이 baseTimeEntity를 상속할 경우 필드들도 칼럼으로 인식하도록 한다.
@MappedSuperclass
//baseTimeEntity 클래스에 auditing기능을 포함시킵니다.
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    //entity가 생성되어 저장될 때 시간이 자동으로 저장 됩니다.
    @CreatedDate
    private LocalDateTime createdDate;

    //조회한 entity의 값을 변경할 때 시간이 자동으로 저장 됩니다.
    @LastModifiedDate
    private LocalDateTime modifiedDate;

}