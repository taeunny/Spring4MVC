package taeeun.hello.spring4.service;

import taeeun.hello.spring4.model.Board;

import java.util.List;

public interface BoardService {

    List<Board> readBoard(int cpg);
    Board readOneBoard(String bno);
}
