package board240206.board;

import lombok.Getter;
import lombok.Setter;

import java.sql.Clob;

@Getter
@Setter
public class BoardRequest {
    private int board_id;
    private String board_title;
    private Clob board_cnt;
    private String board_writer;
    private int board_pwd;
    private int category_id;
}
