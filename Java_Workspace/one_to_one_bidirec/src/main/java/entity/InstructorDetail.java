package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="instructor_detail")
@Data
public class InstructorDetail {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int detail_id;
	private String youtube;
	private String hobby;
	@OneToOne(mappedBy = "instructordetail", cascade = CascadeType.ALL)
	private Instructor instructor;
	
	
	
	public InstructorDetail() {
		super();
	}



	public InstructorDetail(String youtube, String hobby) {
		super();
		this.youtube = youtube;
		this.hobby = hobby;
	}



	public int getDetail_id() {
		return detail_id;
	}



	public void setDetail_id(int detail_id) {
		this.detail_id = detail_id;
	}



	public String getYoutube() {
		return youtube;
	}



	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}



	public String getHobby() {
		return hobby;
	}



	public void setHobby(String hobby) {
		this.hobby = hobby;
	}



	public Instructor getInstructor() {
		return instructor;
	}



	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}



	@Override
	public String toString() {
		return "InstructorDetail [detail_id=" + detail_id + ", youtube=" + youtube + ", hobby=" + hobby
				+ ", instructor=" + instructor + "]";
	}
	
	
	
	
	
}
