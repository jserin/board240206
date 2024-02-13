package board240206.board;

import lombok.Getter;

import java.sql.Clob;
import java.time.LocalDateTime;

@Getter
public class BoardResponse {
    private int board_id;
    private String board_title;
    private Clob board_cnt;
    private String board_writer;
    private int board_pwd;
    private int category_id;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private int group_id;
    private boolean board_del;
}
