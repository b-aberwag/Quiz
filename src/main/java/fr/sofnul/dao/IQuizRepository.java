package fr.sofnul.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.sofnul.entities.Question;
@RepositoryRestResource
public interface IQuizRepository extends MongoRepository<Question, Long>{
	
}
