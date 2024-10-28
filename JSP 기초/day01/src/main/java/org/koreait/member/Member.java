package org.koreait.member;


import lombok.*;

//@Setter @Getter @ToString

//@Data
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
@ToString
public class Member {
    private long seq; //회원번호
    private final String email; // 이메일
    //@NonNull
   // @ToString.Exclude // Tostring에서 배제
    private final String password;

}
