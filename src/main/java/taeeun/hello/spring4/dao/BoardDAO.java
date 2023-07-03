package taeeun.hello.spring4.dao;

import taeeun.hello.spring4.model.Board;

import java.util.List;

public interface BoardDAO {
    List<Board> selectBoard(int snum);
    Board selectOneBoard(String bno);

    // 클래스 사용: 여러개의 변수를 숨겨서 보낼 수 있는 장점(캡슐화)
    int insertBoard(Board bd);
}
