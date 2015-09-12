package es.mystereo.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import es.mystereo.entities.News;
import es.mystereo.repository.NewsRepository;
import es.mystereo.services.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

	@Resource
	NewsRepository newsRepository;
	
	@Override
	public String sayHello() {
		
		News news = new News();
		
		news.setId(new Long(3));
		news.setText("INSERTADO");
		news.setTitle("INSERTADO");
		
		newsRepository.save(news);
		
		StringBuilder ret = new StringBuilder();
		newsRepository.findAll().forEach(n -> ret.append(n.getTitle() + " " + n.getText()));
		
		return "Hello Alex from Spring: " + ret.toString();
	}
	
	

}
