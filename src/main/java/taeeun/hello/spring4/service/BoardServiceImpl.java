package taeeun.hello.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taeeun.hello.spring4.dao.BoardDAO;
import taeeun.hello.spring4.model.Board;

import java.util.List;

@Service("bsrv")
public class BoardServiceImpl implements BoardService {

    @Autowired BoardDAO bdao;
    @Override
    public List<Board> readBoard(int cpg) {
        int snum = (cpg-1) * 15;



        return bdao.selectBoard(snum);

    }
}
