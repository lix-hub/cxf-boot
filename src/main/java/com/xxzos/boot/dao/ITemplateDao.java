package com.xxzos.boot.dao;

import java.util.List;

import com.xxzos.boot.vo.TemplateVO;

public interface ITemplateDao {

	public List<TemplateVO> findName(TemplateVO templateVO);

	public TemplateVO findOne(Long userId);
}
