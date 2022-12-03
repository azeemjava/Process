package in.triton.unidirectional.entity;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="adhar")
@Data
public class AdharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Length(min =12 , max = 12)
	private String adharId;
	 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="std_id",referencedColumnName = "id")
	@JsonIgnoreProperties("adharCard")
	@JsonBackReference
	private Student student;
	
}
