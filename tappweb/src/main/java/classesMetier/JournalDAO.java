package classesMetier;

public class JournalDAO extends ServicesDAO {

	public static final String INSERT_CAHIER_JOURNALS = "INSERT INTO cahier_journal (nom_memo,date_memo) VALUES(?,?)";
	public static final String SELECT_CAHIER_JOURNALS = "SELECT * FROM cahier_journal";
	public static final String SELECT_CAHIER_JOURNAL_PAR_NOM = "SELECT * FROM cahier_journal WHERE nom_memo= ?";
	public static final String UPDATE_CAHIER_JOURNALS = "UPDATE cahier_journal SET nom_memo = ? WHERE nom_memo = ?";
	public static final String DELETE_CAHIER_JOURNALS = "DELETE FROM cahier_journal WHERE nom_memo = ?";
	public static final String DELETE_CAHIER_JOURNALS_DATE = "DELETE FROM cahier_journal WHERE date_memo = ?";
}
