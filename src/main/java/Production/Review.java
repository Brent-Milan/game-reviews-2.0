package Production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String title;
	private String content;
	private String date;
	
	private Genre genre;

	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public Genre getGenre() {
		return genre;
	}
	
	
	
}
