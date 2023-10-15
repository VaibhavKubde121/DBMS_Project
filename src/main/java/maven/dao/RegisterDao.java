package maven.dao;

import java.util.List;

import maven.model.Login;
import maven.model.Mentor;
import maven.model.Register;

public interface RegisterDao {

	public int addRecord(Register reg);

	public int addMentor(Mentor ment);

	public List<Mentor> validateMentor(Login log);

	public List<Register> validateMentee(Login log);

	public int updateRecord(Register reg);

	public int updateMentorRecord(Mentor ment);

	public List<Register> displayAll();

	public List<Register> displayAllStud(String name);
	
	public boolean deleteStudent(int id);

}
