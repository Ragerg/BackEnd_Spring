package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import board.vo.BoardVO;

public class BoardDAO {

	private SqlSession session;

	public BoardDAO() {
		session = new MyConfig().getInstance();
	}

	public void insert() {

		BoardVO board = new BoardVO();
		board.setTitle("VO로 삽입");
		board.setWriter("hong");

		int cnt = session.insert("board.dao.BoardDAO.insert", board);
		session.commit();
		System.out.println("총 " + cnt + "개 행 삽입...");
	}

	public void select() {

		// 전체 게시글 조회
//		List<BoardVO> List = session.selectList("board.dao.BoardDAO.selectAll");
		List<BoardVO> List = session.selectList("board.dao.BoardDAO.selectAll2");
		for (BoardVO boardList : List) {
			System.out.println(boardList);
		}
	}

	public void selectOne() {
		int boardNo = 4;
		BoardVO result = session.selectOne("board.dao.BoardDAO.selectByNo", 4);
		System.out.println(result);

		BoardVO board = new BoardVO();
		board.setNo(4);
		result = session.selectOne("board.dao.BoardDAO.selectByNo2", board);
		System.out.println(result);
	}

	public void selectWhere() {
		/*
		 * // 1. 제목이 '될까??' 이면서 글쓴이가 '홍길동'인 게시물 조회 
		 * BoardVO board = new BoardVO();
		 * board.setTitle("될까??"); board.setWriter("홍길동");
		 */

		/*
		 * // 2. 글쓴이가 '홍길동'인 게시물 조회 
		 * BoardVO board = new BoardVO();
		 * board.setWriter("홍길동");
		 */

		/*
		 * // 3. 제목이 '제목이오'인 게시물 조회 
		 * BoardVO board = new BoardVO();
		 * board.setTitle("제목이오");
		 */

		// 4. 제목, 작성자 없는 경우
		BoardVO board = new BoardVO();

		List<BoardVO> List = session.selectList("board.dao.BoardDAO.selectWhere", board);
		for (BoardVO boardList : List) {
			System.out.println(boardList);
		}
	}
	
	public void selectWhere2() {
		// 1. 제목이 '될까??' 이면서 글쓴이가 '홍길동'인 게시물 조회 
		
		Map<String, String> board = new HashMap<>();
		board.put("title", "될까??");
		board.put("writer", "홍길동");
		
		List<BoardVO> List = session.selectList("board.dao.BoardDAO.selectWhere2", board);
		for (BoardVO boardList : List) {
			System.out.println(boardList);
		}
	}
	
	public void selectWhere3() {
		Map<String, String> board = new HashMap<>();
		board.put("no", "4");
		
		Map<String, Object> result = session.selectOne("board.dao.BoardDAO.selectWhere3", board);
		
		Set<String> keys = result.keySet();
		for (String key : keys) {
			System.out.println("key : " + key + ", value : " + result.get(key));
		}
	}
	
	public void selectNos() {
		int[] nos = {1, 2, 3, 4, 5, 11, 21, 31, 41};
		
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectNos", nos);
		for(BoardVO boardList : list ) {
			System.out.println(boardList);
		}
	}

	public void work() {
//		insert();
//		select();
//		selectOne();
//		selectWhere();
//		selectWhere2();
//		selectWhere3();
		selectNos();
	}

}
