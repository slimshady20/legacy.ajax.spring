package com.jayden.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.jayden.web.mappers.TravelMapper;

import lombok.Data;

@Data

@Component
public class Pager {
//	 @Autowired TravelMapper travelMapper;
//	    private int rowCount, rowStart, rowEnd,
//	        pageCount, pageSize, pageStart, pageEnd,nowPage,
//	        blockCount, blockSize, prevBlock, nextBlock, nowBlock;
//	    private boolean existPrev, existNext;
//	    private String searchWord;
//	    public void paging(){
//	        rowCount = travelMapper.count();
//	        rowStart = nowPage * pageSize ; // 0
//	        rowEnd = (nowPage != (pageCount -1)) ? rowStart + ( pageSize-1): rowCount-1; // 4 0���� �����ϴ� pagecount -1 �ؼ� �ϳ��� ��������� nowPage�� index
//	        pageCount = (rowCount % pageSize != 0) ? rowCount / pageSize+1 : rowCount / pageSize; // 10
//	        //  pageSize =5;
//	        pageStart = nowBlock * blockSize;
//	        pageEnd = (nowBlock != blockCount -1)? pageStart + ( blockSize - 1 ) : pageCount-1;
//	        //   nowPage = 1;
//	        blockCount = (pageCount % blockSize) != 0 ? pageCount / blockSize +1 : pageCount / blockSize;
//	        //   blockSize = 5;
//	        prevBlock = pageStart - blockSize;
//	        nextBlock = pageStart + blockSize;
//	        nowBlock= nowPage / blockSize;
//	        existPrev= nowBlock != 0 ;
//	        System.out.println("existPrev:: " + existPrev);
//	        existNext = (nowBlock+1) != blockCount;
//	        System.out.println("existNext::" + existNext);
//}
}
	    
