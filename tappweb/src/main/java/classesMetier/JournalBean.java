package classesMetier;

import java.sql.Date;

import javax.enterprise.inject.Model;

@Model
public class JournalBean {
	private String name;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void createMemo(String name, Date date) {

	}
}
