package br.com.apigetway.service;

import br.com.apigetway.exceptions.ResourceNotFoundException;
import br.com.apigetway.model.Person;
import br.com.apigetway.repositories.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
    private PersonRespository personRespository;

    // buscando por ID
    public Person findById(Long id){
        logger.info("Finding one person!");
        return personRespository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
    }

    // buscando uma lista
    public List<Person> findAll(){
        logger.info("Finding all people!");
        return personRespository.findAll();
    }

    // criar um usuario
    public Person create (Person person){
        logger.info("Creating one person!");
        return personRespository.save(person);
    }

    // Atualizar um usuario
    public Person update (Person person){
        logger.info("Updating one person!");

        var entity = personRespository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return personRespository.save(person);
    }

    // Deletar um usuario
    public void delete (Long id){
        logger.info("Deleting one person!");

        var entity = personRespository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        personRespository.delete(entity);
    }
}
