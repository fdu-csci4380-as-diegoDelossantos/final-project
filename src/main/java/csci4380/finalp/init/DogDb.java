/**

 * 

 */

package csci4380.finalp.init;



import java.util.Arrays;

import java.util.List;



import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;



import csci4380.finalp.dogs.mongodb.model.Dog;

import csci4380.finalp.dogs.mongodb.repo.DogRepository;



/**

 * @author stajekankati

 *

 */

public class DogDb {

	@Component

	public class InitDogDb implements CommandLineRunner

	{

	private DogRepository dogRepository;



	public InitDogDb(DogRepository dogRepository)

	{

	this.dogRepository = dogRepository;

	}



	@Override

	public void run(String... args) throws Exception

	{

	Dog dogOne = new Dog (null, 01, "Roxy", "Golden Retriever", "Diego", "Salty Springs", 5, false, "12/18/2006");

	Dog dogTwo = new Dog (null, 02, "Rex", "Husky", "Gaby", "Dusty Divot", 4, true, "04/12/2000");



	List<Dog> dogs = Arrays.asList(dogOne, dogTwo);

	dogRepository.saveAll(dogs);



	}

	}



}

