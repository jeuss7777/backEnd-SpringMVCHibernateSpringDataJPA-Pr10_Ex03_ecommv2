package com.jarana.entities;
// Generated Mar 12, 2017 11:10:29 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Inventory generated by hbm2java
 */
@Entity
@Table(name = "Inventory", catalog = "ecommv2")
public class Inventory implements java.io.Serializable {

	private String inLocatCd;
	private Part part;
	private String paPartNb;
	private String inTypeNm;
	private Long inRefCd;
	private Integer inMovedQy;
	private Integer inQohQy;

	public Inventory() {
	}

	public Inventory(String inLocatCd) {
		this.inLocatCd = inLocatCd;
	}

	public Inventory(String inLocatCd, Part part, String paPartNb, String inTypeNm, Long inRefCd, Integer inMovedQy,
			Integer inQohQy) {
		this.inLocatCd = inLocatCd;
		this.part = part;
		this.paPartNb = paPartNb;
		this.inTypeNm = inTypeNm;
		this.inRefCd = inRefCd;
		this.inMovedQy = inMovedQy;
		this.inQohQy = inQohQy;
	}

	@Id

	@Column(name = "in_locat_cd", unique = true, nullable = false, length = 12)
	public String getInLocatCd() {
		return this.inLocatCd;
	}

	public void setInLocatCd(String inLocatCd) {
		this.inLocatCd = inLocatCd;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "in_sku_nb")
	public Part getPart() {
		return this.part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	@Column(name = "pa_part_nb", length = 12)
	public String getPaPartNb() {
		return this.paPartNb;
	}

	public void setPaPartNb(String paPartNb) {
		this.paPartNb = paPartNb;
	}

	@Column(name = "in_type_nm", length = 20)
	public String getInTypeNm() {
		return this.inTypeNm;
	}

	public void setInTypeNm(String inTypeNm) {
		this.inTypeNm = inTypeNm;
	}

	@Column(name = "in_ref_cd")
	public Long getInRefCd() {
		return this.inRefCd;
	}

	public void setInRefCd(Long inRefCd) {
		this.inRefCd = inRefCd;
	}

	@Column(name = "in_moved_qy")
	public Integer getInMovedQy() {
		return this.inMovedQy;
	}

	public void setInMovedQy(Integer inMovedQy) {
		this.inMovedQy = inMovedQy;
	}

	@Column(name = "in_qoh_qy")
	public Integer getInQohQy() {
		return this.inQohQy;
	}

	public void setInQohQy(Integer inQohQy) {
		this.inQohQy = inQohQy;
	}

}
