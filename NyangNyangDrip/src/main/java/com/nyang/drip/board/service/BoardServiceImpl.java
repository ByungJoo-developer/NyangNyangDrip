package com.nyang.drip.board.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession; // 🌟 마이바티스 내장 세션 임포트
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private SqlSession sqlSession; // 🌟 스프링이 자동으로 마이바티스 세션을 꽂아줍니다.

    @Override
    public List<Map<String, Object>> getBoardList() {
        // ⚠️ 주의: 문자열 안에 오타가 나면 에러가 나니 철자 확인 필수!
        // 구조: sqlSession.selectList("XML의_namespace.쿼리의_id");
    	return sqlSession.selectList("com.nyang.drip.mapper.BoardMapper.selectBoardList");
                                                   
    }
}