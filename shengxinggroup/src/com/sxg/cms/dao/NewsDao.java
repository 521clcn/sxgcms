package com.sxg.cms.dao;

import java.util.List;

import com.sxg.cms.entity.News;
import com.sxg.cms.entity.User;

public interface NewsDao {
	public void save(News user); 
	public List<News> list(); 
	public News findById(String id); 
	public List<News> adminList(User user); 
	public void release(String id); 
	public void delete(String id); 
	
}
