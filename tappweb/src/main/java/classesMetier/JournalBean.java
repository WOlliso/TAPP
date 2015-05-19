package classesMetier;

import java.sql.Date;
import java.sql.SQLException;

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

	public void createJournal(String name, Date date) {

	}
	public void deleteJournal() throws SQLException {
		ServicesDAO.preparedStatement(JournalDAO.DELETE_CAHIER_JOURNALS);
		
	}
}
