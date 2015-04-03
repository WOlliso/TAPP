package classesMetier;

public class Requests {


	public static final String INSERT_ELEVE = "INSERT INTO eleves (nom, prenom,age,classe) VALUES(?,?,?,?)";
	public static final String SELECT_ELEVES = "SELECT * FROM eleves";
	public static final String SELECT_ELEVE_PAR_NOM = "SELECT * FROM eleves WHERE nom= ?";
	public static final String SELECT_ELEVES_PAR_CLASSE = "SELECT * FROM eleves WHERE classe= ?";
	public static final String UPDATE_CLASSE_ELEVES="UPDATE eleves SET classe = ? WHERE nom = ?";
	public static final String UPDATE_ELEVE_PAR_NOM="UPDATE eleves SET nom=? prenom=? classe=? WHERE nom = ?";
	public static final String DELETE_ELEVE="DELETE FROM eleves WHERE nom = ?";


	public static final String INSERT_DOCUMENTS = "INSERT INTO documents (nom_documents) VALUES(?)";
	public static final String SELECT_DOCUMENTS = "SELECT * FROM documents";
	public static final String SELECT_DOCUMENT_PAR_NOM = "SELECT * FROM documents WHERE nom_documents= ?";
	public static final String UPDATE_DOCUMENTS="UPDATE documents SET nom_documents = ? WHERE nom_documents = ?";
	public static final String DELETE_DOCUMENTS="DELETE FROM documents WHERE nom_documents = ?";


	public static final String INSERT_CAHIER_JOURNALS = "INSERT INTO cahier_journal (nom_memo,date_memo) VALUES(?,?)";
	public static final String SELECT_CAHIER_JOURNALS = "SELECT * FROM cahier_journal";
	public static final String SELECT_CAHIER_JOURNAL_PAR_NOM = "SELECT * FROM cahier_journal WHERE nom_memo= ?";
	public static final String UPDATE_CAHIER_JOURNALS="UPDATE cahier_journal SET nom_memo = ? WHERE nom_memo = ?";
	public static final String DELETE_CAHIER_JOURNALS="DELETE FROM cahier_journal WHERE nom_memo = ?";
	public static final String DELETE_CAHIER_JOURNALS_DATE="DELETE FROM cahier_journal WHERE date_memo = ?";


	public static final String SELECT_PROF_MDP = "SELECT pwd FROM professeurs WHERE user=?";



}
