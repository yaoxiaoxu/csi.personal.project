package com.yaoxx.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Value("${server.port}")
	private String port;
	
	public List<String> getName(){
		List<String> list = new ArrayList<String>();
		list.add("姚晓旭-"+port);
		list.add("刘诗诗-"+port);
		list.add("高圆圆-"+port);
		return list;
	}

}
