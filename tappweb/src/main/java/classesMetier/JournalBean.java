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
	public void createJournal() throws SQLException {
		ServicesDAO.preparedStatement(JournalDAO.INSERT_CAHIER_JOURNALS);
				
	}
	public void modifyJournal() throws SQLException {
		ServicesDAO.preparedStatement(JournalDAO.UPDATE_CAHIER_JOURNALS);
	}
	public void readJournal() throws SQLException {
		ServicesDAO.preparedStatement(JournalDAO.SELECT_CAHIER_JOURNALS);
	}
}
