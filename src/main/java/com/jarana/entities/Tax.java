package com.jarana.entities;
// Generated Mar 12, 2017 11:10:29 PM by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tax generated by hbm2java
 */
@Entity
@Table(name = "Tax", catalog = "ecommv2")
public class Tax implements java.io.Serializable {

	private Long taTaxId;
	private String taStateCd;
	private String taCatgryNm;
	private BigDecimal taTaxPc;

	public Tax() {
	}

	public Tax(String taStateCd, String taCatgryNm) {
		this.taStateCd = taStateCd;
		this.taCatgryNm = taCatgryNm;
	}

	public Tax(String taStateCd, String taCatgryNm, BigDecimal taTaxPc) {
		this.taStateCd = taStateCd;
		this.taCatgryNm = taCatgryNm;
		this.taTaxPc = taTaxPc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ta_tax_id", unique = true, nullable = false)
	public Long getTaTaxId() {
		return this.taTaxId;
	}

	public void setTaTaxId(Long taTaxId) {
		this.taTaxId = taTaxId;
	}

	@Column(name = "ta_state_cd", nullable = false, length = 2)
	public String getTaStateCd() {
		return this.taStateCd;
	}

	public void setTaStateCd(String taStateCd) {
		this.taStateCd = taStateCd;
	}

	@Column(name = "ta_catgry_nm", nullable = false, length = 15)
	public String getTaCatgryNm() {
		return this.taCatgryNm;
	}

	public void setTaCatgryNm(String taCatgryNm) {
		this.taCatgryNm = taCatgryNm;
	}

	@Column(name = "ta_tax_pc", precision = 5, scale = 3)
	public BigDecimal getTaTaxPc() {
		return this.taTaxPc;
	}

	public void setTaTaxPc(BigDecimal taTaxPc) {
		this.taTaxPc = taTaxPc;
	}

}
