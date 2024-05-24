package com.example.library.service;

import java.util.List;

import com.example.library.entity.Publisher;
import org.springframework.stereotype.Service;

@Service
public interface PublisherService {

	public List<Publisher> findAllPublishers();

	public Publisher findPublisherById(Long id);

	public void createPublisher(Publisher publisher);

	public void updatePublisher(Publisher publisher);

	public void deletePublisher(Long id);

}
