package Production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String title;
	@Lob
	private String content;
	private String date;
	private String imageUrl;
	
	
	private Review() {
		
	}
	
	
	//check to see whether generated id is required
	private Review(String title, Genre genre,  String content, String date, String imageUrl) {
		this.title = title;
		this.genre = genre;
		this.content = content;
		this.date = date;
		this.imageUrl = imageUrl;
	}
	
	@ManyToOne
	private Genre genre;

	public String getImageUrl() {
		return imageUrl;
	}


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
