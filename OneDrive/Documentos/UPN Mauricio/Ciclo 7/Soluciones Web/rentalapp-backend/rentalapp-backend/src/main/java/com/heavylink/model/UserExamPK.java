package com.heavylink.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class UserExamPK {
	@ManyToOne
	@JoinColumn(name="id_exam", nullable = false, foreignKey = @ForeignKey(name= "FK_USEREXAM_EXAM"))
	private Exam exam;
	
	@ManyToOne
	@JoinColumn(name="id_user", nullable = false, foreignKey = @ForeignKey(name= "FK_USEREXAM_USER"))
	private User user;
}
