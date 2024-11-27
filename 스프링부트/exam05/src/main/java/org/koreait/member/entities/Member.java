package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.koreait.global.Entities.BaseEntity;
import org.koreait.member.constants.Authority;

import java.time.LocalDateTime;

@Data
@Entity
//@Table(name = "KT_MEMBER")
public class Member extends BaseEntity {
    @Id // 기본키
    //@GeneratedValue(strategy = GenerationType.AUTO) // 기본키의 숫자 자동 증감
    @GeneratedValue
    private Long seq;

    @Column(length = 65, nullable = false, unique = true)
    private String email;

    @Column(length = 65, nullable = false)
    private String password;

    @Column(length = 40, nullable = false)
    private String name;

    //@Lob // 오라클 기즌 CLOB
    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private Authority authority;


}