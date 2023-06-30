package taeeun.hello.spring4.dao;

import taeeun.hello.spring4.model.Board;

import java.util.List;

public interface BoardDAO {
    List<Board> selectBoard(int snum);
}
