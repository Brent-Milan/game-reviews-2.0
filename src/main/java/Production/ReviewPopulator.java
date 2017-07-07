package Production;

import javax.annotation.Resource;

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
		
		
		
	}
	
	
	
}
