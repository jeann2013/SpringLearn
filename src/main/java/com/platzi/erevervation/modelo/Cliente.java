/**
 * 
 */
package com.platzi.erevervation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa el cliente
 * @author jeann
 *
 */

@Data
@Entity 
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCli;
	private String nombreCli;	
	private String apellidoCli;
	private String indenticacionCli;
	private String direccionCli;
	private String telefonoCli;	
	private String emailCli;
	
	@OneToMany(mappedBy="cliente")
	private Set<Reserva> reservas;
	
	public Cliente() {
		//
	}
	
}
