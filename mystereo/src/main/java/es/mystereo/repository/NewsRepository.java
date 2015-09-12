package es.mystereo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.mystereo.entities.News;

public interface NewsRepository extends CrudRepository<News, Long>{

}
