package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controller.RequestJoin;
import org.koreait.member.repository.MemberRepository;
import org.koreait.member.validators.AdvancedJoinValidator;
import org.koreait.member.validators.JoinValidator;

    /**
    * 회원 가입 기능
    */

public class JoinService {
    // 구성
    // private Validator<RequestJoin> joinValidator = new AdvancedJoinValidator(); x
    private final Validator<RequestJoin> joinValidator;
    private final MemberRepository repository;

        /**
         * 의존관계
         * @param joinValidator
         * 조인 서비스 객체 생성을 위해서는 joinValidator가 필수!
         */
    public JoinService(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }

        /**
         * 연관관계
         * 조인서비스객체를 생성할 때 필수는 아니기 때문에
         * @param joinValidator
         */

   /* public void setValidator(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    } // set를 통한
*/

    /**
     * 가입 처리
     * 
     * RequestJoin - DTO ( Data Transfer Object) : 사용자가 입력한 값을 전달
     */
    
    public void process(RequestJoin form) {

        // form, joinService에 서로 영향을 주고 받는 관계 - 변화에 영향을 받는다
        // 통제가 필요! - 메서드 안에 감출필요! 캡슐화! / 변화에 닫힌 구조!
        joinValidator.check(form);
        
    }
}
