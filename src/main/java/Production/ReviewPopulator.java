package Production;

import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {
	
	@Resource
	private ReviewRepository reviewRepo;
	
	@Resource
	private GenreRepository genreRepo;
	
	public void run(String... args) throws Exception {
		
		Genre mmo = new Genre("MMO");
		genreRepo.save(mmo);
		
		Genre fps = new Genre("FPS");
		genreRepo.save(fps);
		
		Genre moba = new Genre("MOBA");
		genreRepo.save(moba);
		
		
		Review review1 = new Review("Final Fantasy XIV", mmo, "Lorem ipsum "
				+ "dolor sit amet, consectetur adipiscing elit. Vivamus tortor "
				+ "est, congue id elit at, sagittis iaculis urna. Suspendisse "
				+ "sagittis a libero commodo lacinia. Vivamus feugiat nunc ut "
				+ "lacus aliquet, sit amet fringilla libero tempor. "
				+ "Maecenas pharetra sit amet metus sed malesuada. Donec ac massa "
				+ "sed mi lobortis vulputate. Integer at lacus eu elit mollis egestas "
				+ "id vitae nibh. Duis et nunc at velit varius sodales. Proin et "
				+ "accumsan risus.", "July 6, 2017", "/images/ffxiv.jpg");
		reviewRepo.save(review1);
		
		Review review2 = new Review("Heroes of the Storm", moba, "Lorem ipsum "
				+ "dolor sit amet, consectetur adipiscing elit. Vivamus tortor "
				+ "est, congue id elit at, sagittis iaculis urna. Suspendisse "
				+ "sagittis a libero commodo lacinia. Vivamus feugiat nunc ut "
				+ "lacus aliquet, sit amet fringilla libero tempor. "
				+ "Maecenas pharetra sit amet metus sed malesuada. Donec ac massa "
				+ "sed mi lobortis vulputate. Integer at lacus eu elit mollis egestas "
				+ "id vitae nibh. Duis et nunc at velit varius sodales. Proin et "
				+ "accumsan risus.", "July 6, 2017", "/images/hots.jpg");
		reviewRepo.save(review2);
		
		Review review3 = new Review("Destiny 2", fps, "Lorem ipsum "
				+ "dolor sit amet, consectetur adipiscing elit. Vivamus tortor "
				+ "est, congue id elit at, sagittis iaculis urna. Suspendisse "
				+ "sagittis a libero commodo lacinia. Vivamus feugiat nunc ut "
				+ "lacus aliquet, sit amet fringilla libero tempor. "
				+ "Maecenas pharetra sit amet metus sed malesuada. Donec ac massa "
				+ "sed mi lobortis vulputate. Integer at lacus eu elit mollis egestas "
				+ "id vitae nibh. Duis et nunc at velit varius sodales. Proin et "
				+ "accumsan risus.", "July 6, 2017", "/images/destiny.jpg");
		reviewRepo.save(review3);
	}
	
	
	
}
