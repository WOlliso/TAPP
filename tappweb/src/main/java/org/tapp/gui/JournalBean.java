package org.tapp.gui;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.tapp.bll.Document;
import org.tapp.bll.Journal;
import org.tapp.dal.InjectionDAOInter;
import org.tapp.dal.JournalDAO;
import org.tapp.dal.ServicesDAO;

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

	
	
	//Injection Fun Stuff Let's do it.
	@Inject
	InjectionDAOInter myJournalDAO;
	
	public String createJournal(String name, Date date) {
		myJournalDAO.createJournal(name);
		return "journalcreated";
	}
	
	public ArrayList<Journal> getJournalList() throws SQLException {
		
		return myJournalDAO.getJournalList();
		
	}
	
	public String deleteJournal() throws SQLException {
		myJournalDAO.deleteJournal();
		return "journaldeleted";
		
	}
	
	public void modifyJournal() throws SQLException {
		
	}
	
	public Journal readJournal() throws SQLException {
		return myJournalDAO.readJournal(name);
		
	}
}
