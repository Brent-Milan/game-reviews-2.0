package Production;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@OneToMany(mappedBy="genre")
	private Set<Review> reviews;
	
	private Genre() {
		
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

}
