package org.koreait.board.entities;

import lombok.Data;

@Data // get,.set, tostring, equalsAndHanshcode
public class Board {
    private long seq; // 게시글 번호
    private String poster; // 작성자
    private String subject; // 제목
    private String content; // 내용


}
