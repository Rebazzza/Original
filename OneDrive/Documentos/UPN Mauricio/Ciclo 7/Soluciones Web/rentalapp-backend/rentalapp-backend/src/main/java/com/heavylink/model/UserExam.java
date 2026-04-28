package com.heavylink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(UserExamPK.class)
public class UserExam {
	@Id
	//@ManyToOne
	private User user;
	
	@Id
	//@ManyToOne
	private Exam exam;
	
	/*static class UserExamPK{
		// TODO
	}
	*/
}
