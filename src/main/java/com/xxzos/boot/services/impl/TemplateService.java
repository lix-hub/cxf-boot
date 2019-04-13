package com.xxzos.boot.services.impl;

import com.xxzos.boot.dao.ITemplateDao;
import com.xxzos.boot.services.ITemplateService;
import com.xxzos.boot.vo.TemplateVO;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
@Named
public class TemplateService implements ITemplateService {

	@Inject
	private ITemplateDao templateDao; 
	@Override
	public String testGet(String name) {
		
		return "Hello: "+name;
	}

	@Override
	public List<TemplateVO> findTemplate(TemplateVO templateVO) {
		System.out.println("ddddd");
		List<TemplateVO> list = templateDao.findName(templateVO);
		System.out.println(list);
		return list;
	}

	@Override
	public TemplateVO findOneTemplate(Long id) {
		TemplateVO vo = templateDao.findOne(id);
		return vo;
	}

}
