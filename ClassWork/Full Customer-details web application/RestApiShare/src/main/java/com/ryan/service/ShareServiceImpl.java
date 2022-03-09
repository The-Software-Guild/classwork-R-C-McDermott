package com.ryan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryan.entity.Share;
import com.ryan.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {
	
	@Autowired
	private ShareDao shareDao;

	@Override
	public Share getShareById(int id) {
		return shareDao.getById(id); 
	}

}
