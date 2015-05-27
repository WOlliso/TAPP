package org.tapp.dal;

import java.util.ArrayList;

import org.tapp.bll.Journal;

public interface JournalDAOInter {

	
	
		public ArrayList<Journal> getJournalList();
		
		public String createJournal(String name);
		
		public String deleteJournal();
		
		public Journal readJournal(String name);
	
}
