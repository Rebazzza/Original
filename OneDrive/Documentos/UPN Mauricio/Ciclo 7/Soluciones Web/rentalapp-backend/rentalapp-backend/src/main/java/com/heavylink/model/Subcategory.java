package com.heavylink.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Subcategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Integer idSubcategory;
	
	@ManyToOne //category_id_category
	@JoinColumn(name="id_category", nullable=false,
				referencedColumnName = "idCategory",
				foreignKey = @ForeignKey(name="FK_SUBCATEGORY_CATEGORY"))
	private Category category;
	
	@Column(nullable = false, length = 60)
	private String name;
	
	@Column(nullable = false)
	private boolean status;
}
