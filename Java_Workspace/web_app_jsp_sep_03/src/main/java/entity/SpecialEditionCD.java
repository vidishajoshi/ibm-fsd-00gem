package entity;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("special")
public class SpecialEditionCD extends CD {
	private String newfeature;

	public SpecialEditionCD() {
	}

	public SpecialEditionCD(String title, String artist, Date purchasedate, double cost, String feature) {
		super(title, artist, purchasedate, cost);
		newfeature = feature;
	}

	public void setNewfeature(String s) {
		newfeature = s;
	}

	public String getNewfeature() {
		return newfeature;
	}
}
