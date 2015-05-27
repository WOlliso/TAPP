package org.tapp.dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;



import org.tapp.bll.Journal;


public class JournalDAO extends ServicesDAO  implements JournalDAOInter {

	public static final String INSERT_CAHIER_JOURNALS = "INSERT INTO cahier_journal (nom_memo) VALUES(?)";
	public static final String SELECT_CAHIER_JOURNALS = "SELECT * FROM cahier_journal";
	public static final String SELECT_CAHIER_JOURNAL_PAR_NOM = "SELECT * FROM cahier_journal WHERE nom_memo= ?";
	public static final String UPDATE_CAHIER_JOURNALS = "UPDATE cahier_journal SET nom_memo = ? WHERE nom_memo = ?";
	public static final String DELETE_CAHIER_JOURNALS = "DELETE FROM cahier_journal WHERE nom_memo = ?";
	public static final String DELETE_CAHIER_JOURNALS_DATE = "DELETE FROM cahier_journal WHERE date_memo = ?";
	
	
	public String createJournal(String name) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = ServicesDAO.preparedStatement(INSERT_CAHIER_JOURNALS);
			preparedStatement.setString(1, name);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "journalcreated";
		
	}

	public void deleteJournal(String name) throws SQLException {
		final PreparedStatement preparedStatement = ServicesDAO
				.preparedStatement(DELETE_CAHIER_JOURNALS);
		preparedStatement.setString(1, name);
		preparedStatement.executeUpdate();
	}

	@Override
	public ArrayList<Journal> getJournalList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteJournal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Journal readJournal(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
