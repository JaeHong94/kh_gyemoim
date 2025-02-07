package com.gyemoim.dao.board;

import com.gyemoim.domain.board.AttachedVO;
import com.gyemoim.domain.board.BoardVO;
import com.gyemoim.dto.board.BoardModifyDTO;

import java.util.List;

public interface BoardModifyDAO {

  BoardVO modify(int bid);
  AttachedVO attached(int bid);

  public void modifyUpdate(BoardModifyDTO dto) throws Exception;
}
