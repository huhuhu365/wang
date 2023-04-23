package com.firstdevelop.boot.entity;



public class Cat {
	/**
	 * 猫ID
	 */
	private int id;
	
	/**
	 * 猫の名前
	 */
	private String name;
	
	/**
	 * 猫の色
	 */
	private String color;
	
	/**
	 * 猫の種類
	 */
	private String species;
	
	/**
	 * 猫のサイズ
	 */
	private int size;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param id
	 * @param name
	 * @param color
	 * @param species
	 * @param size
	 */
	public Cat(int id, String name, String color, String species, int size) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.species = species;
		this.size = size;
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", color=" + color + ", species=" + species + ", size=" + size
				+ "]";
	}

}
