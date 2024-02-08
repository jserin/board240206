package board240206.board.mapper;

import board240206.board.entity.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Select("SELECT * FROM board")
    List<Board> findAll();

    @Insert("INSERT INTO board(board_title, board_writer) VALUES(one, two")
    @Options(useGeneratedKeys = true, keyProperty = "board_id")
    int save(@Param("board") final Board board);
}
