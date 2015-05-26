package org.tapp.dal;

import java.util.ArrayList;

import org.tapp.bll.Journal;

public interface JournalDAOInter {

	
	
		public ArrayList<Journal> getJournalList();
		
		public Journal createJournal(String name);
		
		public String deleteJournal();
		
		public Journal readJournal(String name);
	
}
