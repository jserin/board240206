package board240206.board.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Board {
    private int board_id;
    private String board_title;
//    private Clob board_cnt;
    private String board_writer;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
