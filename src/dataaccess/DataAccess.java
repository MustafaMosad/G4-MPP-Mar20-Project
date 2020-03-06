package dataaccess;

import java.util.HashMap;

import business.Book;
import business.CheckOutRecord;
import business.LibraryMember;

public interface DataAccess {
	public HashMap<String, Book> readBooksMap();

	public HashMap<String, User> readUserMap();

	public HashMap<String, LibraryMember> readMemberMap();

	public HashMap<String, CheckOutRecord> readCheckOutRecordsMap() ;
	
	public void saveNewMember(LibraryMember member);

	public void saveNewBook(Book book);
	
	public void saveNewCheckOutRecord(CheckOutRecord checkOutRecord  ) ;
}
