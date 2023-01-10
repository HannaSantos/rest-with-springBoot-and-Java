package br.com.apigetway.service;

import br.com.apigetway.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    // buscando por ID
    public Person findById(String id){
        logger.info("Finding one person!");

        // Implementando um Mock

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leonardo");
        person.setLastName("Salomão");
        person.setAddress("Vila medeiro - tucuruvi - são paulo");
        person.setGender("Male");

        return person;
    }

    // buscando uma lista
    public List<Person> findAll(){
        logger.info("Finding all people!");

        List<Person> persons = new ArrayList<>();

        // Lista de pessoas mockados
        for (int i = 0; i < 10; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    // criar um usuario
    public Person create (Person person){
        logger.info("Creating one person!");
        return person;
    }

    // Atualizar um usuario
    public Person update (Person person){
        logger.info("Updating one person!");
        return person;
    }

    // Deletar um usuario
    public void delete (String id){
        logger.info("Deleting one person!");
    }

    // Dados mockados
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name: " + i);
        person.setLastName("Last name: " + i);
        person.setAddress("Some address in Brasil " + i);
        person.setGender("Male");

        return person;
    }


}
