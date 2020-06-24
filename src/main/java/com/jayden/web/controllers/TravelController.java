package com.jayden.web.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jayden.web.domains.TravelDTO;
import com.jayden.web.mappers.TravelMapper;
import com.jayden.web.proxy.Box;
import com.jayden.web.proxy.IFunction;
import com.jayden.web.proxy.Pager;
import com.sun.javafx.collections.MappingChange.Map;

@Controller
@RequestMapping("/travels")
public class TravelController {
	
}
//		@Autowired Pager pager;
//	    @Autowired TravelMapper travelMapper;
//	    @Autowired Box<Object> box;
//	    @GetMapping("/{searchWord}/{pageNumber}")
//	    public Map<?,?> list(@PathVariable("pageNumber") String pageNumber,
//	                         @PathVariable("searchWord") String searchWord){
//
//	        if(searchWord.equals("null")){
//	            System.out.println("�˻�� ����");
//	            pager.setSearchWord("");
//	        }else{
//	            System.out.println("�˻��" + searchWord);
//	            pager.setSearchWord(searchWord);
//	        }
//	        System.out.println("�Ѿ�� ������ ��ȣ"+pageNumber);
//	        pager.setNowPage(Integer.parseInt((pageNumber)));
//	        pager.setBlockSize(5);
//	        pager.setPageSize(10);
//	        pager.paging();
//	        IFunction<Pager, List<TravelDTO>> f = p -> travelMapper.selectTravels(p);
//	        List<TravelDTO> list = f.apply(pager);
//	        System.out.println("****************************");
//	        for(TravelDTO m : list) {
//	            System.out.println(m.toString());
//	        }// ���� for �� p 166 for(Ÿ�Ժ����� : �迭 �Ǵ� �÷���) {  �ݺ��� ���� }
//	        box.clear();
//	        box.put("pager",pager);
//	        box.put("list",list);
//	        return box.get();
//	    }
//
//	    @GetMapping("/{searchWord}")
//	    public Map<?,?> list(@PathVariable String searchWord) {
//	        System.out.println("�Ѿ�� Ű����" + searchWord);
//
//	        pager.setBlockSize(5);
//	        pager.setPageSize(10);
//	        pager.paging();
//	        IFunction<Pager, List<TravelDTO>> f = p -> travelMapper.selectTravels(p);
//	        List<TravelDTO> list = f.apply(pager);
//	        System.out.println("****************************");
//	        for(TravelDTO m : list) {
//	            System.out.println(m.toString());
//	        }
//	        box.clear();
//	        box.put("pager",pager);
//	        box.put("list",list);
//	        System.out.println(box.get("pager"));
//	        return box.get();
//	    }
//	}