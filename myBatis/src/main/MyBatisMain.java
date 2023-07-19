package main;

import board.dao.BoardDAO;

public class MyBatisMain {
	
	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		dao.work();
	}

}
