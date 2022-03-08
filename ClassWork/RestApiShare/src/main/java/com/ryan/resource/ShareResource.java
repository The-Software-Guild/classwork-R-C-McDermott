package com.ryan.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ryan.entity.Share;
import com.ryan.service.ShareService;

@RestController
public class ShareResource {
	
	@Autowired
	private ShareService shareService;
	
	@GetMapping(path = "/shares/{sid}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public Share getShareById(@PathVariable("sid") int id) {
		return shareService.getShareById(id);
	}

}
