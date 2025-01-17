package entity;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("international")
public class InternationalCD extends CD {
	private String languages;
	private int region;

	public InternationalCD() {
	}

	public InternationalCD(String title, String artist, Date purchasedate, double cost, String language, int region) {
		super(title, artist, purchasedate, cost);
		languages = language;
		this.region = region;
	}

	public void setLanguages(String s) {
		languages = s;
	}

	public String getLanguages() {
		return languages;
	}

	public void setRegion(int i) {
		region = i;
	}

	public int getRegion() {
		return region;
	}
}