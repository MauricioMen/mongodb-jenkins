package com.ejercicios.model;


import java.io.Serializable;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("VideoGame")
public class VideoGame implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String idVideoGame =  new ObjectId().toString();
	
	private String name;
	
	private String genero;
	
	private Integer existencias;
	
	private String fechaRegistro;

	public String getIdVideoGame() {
		return idVideoGame;
	}

	public void setIdVideoGame(String idVideoGame) {
		this.idVideoGame = idVideoGame;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getExistencias() {
		return existencias;
	}

	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "VideoGame [idVideoGame=" + idVideoGame + ", name=" + name + ", genero=" + genero + ", existencias="
				+ existencias + ", fechaRegistro=" + fechaRegistro + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idVideoGame);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoGame other = (VideoGame) obj;
		return Objects.equals(idVideoGame, other.idVideoGame);
	}
	
	
	

}
