package beans;

import org.springframework.stereotype.Component;

@Component("Thebad")
public class Badminton implements Coach{

	public String getDailyWorlkout() {
		// TODO Auto-generated method stub
		return "welcome to badminton club";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
