/**
 * 
 */
package com.platzi.erevervation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.erevervation.modelo.Cliente;

/**
 * Interface pata definir las relaciona de base de datos con clientes
 * @author jeann
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
