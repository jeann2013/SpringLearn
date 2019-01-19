package com.platzi.erevervation.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase de reserva
 * @author jeann
 *
 */
@Data
@Entity
@Table(name = "reserva")
public class Reserva {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idRes;
	private Date fechaIngresoRes;
	private int cantidadPersonasRes;
	private String descriptionRes;
	
	@ManyToOne
	@JoinColumn(name="idCli")
	private Cliente cliente;
	

}
