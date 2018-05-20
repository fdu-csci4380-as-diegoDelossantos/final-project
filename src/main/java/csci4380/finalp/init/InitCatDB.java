/**
 * 
 */
package csci4380.finalp.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import csci4380.finalp.cat.jpa.model.Cat;
import csci4380.finalp.cat.jpa.repo.CatRepository;

/**
 * @author Diego
 *
 */
@Component
public class InitCatDb implements CommandLineRunner{
	private CatRepository catRepository;
	@Autowired
	public InitCatDb(CatRepository catRepository) {
		super();
		this.catRepository = catRepository;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cat catOne = new Cat("Nati", "fluffy", "Diego", "Nj", 5, true, "March");
		Cat savedCatOne = catRepository.save(catOne);
		System.out.println("-----> DIEGO----->Saved catOne");
	}
	

}
