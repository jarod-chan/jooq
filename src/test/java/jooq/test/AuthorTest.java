package jooq.test;

import static jooq.Tables.AUTHOR;
import jooq.tables.records.AuthorRecord;

import org.jooq.DSLContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring.xml"})
public class AuthorTest {
	
	 @Autowired
	 DSLContext dsl;
	 
	 @Test
	 public void createAndUpdateAndDelete(){
		AuthorRecord record = dsl.newRecord(AUTHOR);
		record.setId(101);
		record.setFirstName("1");
		record.setLastName("2");
		record.store();
		
		AuthorRecord authorRecord = dsl.fetchOne(AUTHOR,AUTHOR.ID.equal(101));
		
		authorRecord.setFirstName("f2");
		authorRecord.store();
		
		authorRecord.delete();
	 }

	@Test
	public void allRecord(){
		dsl.select().from(AUTHOR).fetch();
	}
	
	
	
	
	
}
