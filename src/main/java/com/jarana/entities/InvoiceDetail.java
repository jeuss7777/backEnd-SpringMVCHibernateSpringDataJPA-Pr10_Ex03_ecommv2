package com.jarana.entities;
// Generated Mar 12, 2017 11:10:29 PM by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * InvoiceDetail generated by hbm2java
 */
@Entity
@Table(name = "Invoice_Detail", catalog = "ecommv2")
public class InvoiceDetail implements java.io.Serializable {

	private InvoiceDetailId id;
	private Customer customer;
	private InvoiceHeader invoiceHeader;
	private Part part;
	private Date idInvDt;
	private String idCatgryNm;
	private int idSoldQy;
	private BigDecimal idPriceAm;
	private BigDecimal idTaxAm;
	private BigDecimal idSubtotalAm;

	public InvoiceDetail() {
	}

	public InvoiceDetail(InvoiceDetailId id, Customer customer, InvoiceHeader invoiceHeader, Part part, Date idInvDt,
			String idCatgryNm, int idSoldQy, BigDecimal idPriceAm, BigDecimal idTaxAm, BigDecimal idSubtotalAm) {
		this.id = id;
		this.customer = customer;
		this.invoiceHeader = invoiceHeader;
		this.part = part;
		this.idInvDt = idInvDt;
		this.idCatgryNm = idCatgryNm;
		this.idSoldQy = idSoldQy;
		this.idPriceAm = idPriceAm;
		this.idTaxAm = idTaxAm;
		this.idSubtotalAm = idSubtotalAm;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idInvNb", column = @Column(name = "id_inv_nb", nullable = false)),
			@AttributeOverride(name = "idSkuNb", column = @Column(name = "id_sku_nb", nullable = false)) })
	public InvoiceDetailId getId() {
		return this.id;
	}

	public void setId(InvoiceDetailId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_custmr_id", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_inv_nb", nullable = false, insertable = false, updatable = false)
	public InvoiceHeader getInvoiceHeader() {
		return this.invoiceHeader;
	}

	public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
		this.invoiceHeader = invoiceHeader;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sku_nb", nullable = false, insertable = false, updatable = false)
	public Part getPart() {
		return this.part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "id_inv_dt", nullable = false, length = 19)
	public Date getIdInvDt() {
		return this.idInvDt;
	}

	public void setIdInvDt(Date idInvDt) {
		this.idInvDt = idInvDt;
	}

	@Column(name = "id_catgry_nm", nullable = false, length = 15)
	public String getIdCatgryNm() {
		return this.idCatgryNm;
	}

	public void setIdCatgryNm(String idCatgryNm) {
		this.idCatgryNm = idCatgryNm;
	}

	@Column(name = "id_sold_qy", nullable = false)
	public int getIdSoldQy() {
		return this.idSoldQy;
	}

	public void setIdSoldQy(int idSoldQy) {
		this.idSoldQy = idSoldQy;
	}

	@Column(name = "id_price_am", nullable = false, precision = 10, scale = 4)
	public BigDecimal getIdPriceAm() {
		return this.idPriceAm;
	}

	public void setIdPriceAm(BigDecimal idPriceAm) {
		this.idPriceAm = idPriceAm;
	}

	@Column(name = "id_tax_am", nullable = false, precision = 10, scale = 4)
	public BigDecimal getIdTaxAm() {
		return this.idTaxAm;
	}

	public void setIdTaxAm(BigDecimal idTaxAm) {
		this.idTaxAm = idTaxAm;
	}

	@Column(name = "id_subtotal_am", nullable = false, precision = 10, scale = 4)
	public BigDecimal getIdSubtotalAm() {
		return this.idSubtotalAm;
	}

	public void setIdSubtotalAm(BigDecimal idSubtotalAm) {
		this.idSubtotalAm = idSubtotalAm;
	}

}
