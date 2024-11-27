package org.koreait.board.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class BoardView2 {
    @EmbeddedId
    private BoardView2Id id;

}
