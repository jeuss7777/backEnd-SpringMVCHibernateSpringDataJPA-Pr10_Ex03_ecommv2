package com.jarana.entities;
// Generated Mar 12, 2017 11:10:29 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * InvoiceDetailId generated by hbm2java
 */
@Embeddable
public class InvoiceDetailId implements java.io.Serializable {

	private long idInvNb;
	private long idSkuNb;

	public InvoiceDetailId() {
	}

	public InvoiceDetailId(long idInvNb, long idSkuNb) {
		this.idInvNb = idInvNb;
		this.idSkuNb = idSkuNb;
	}

	@Column(name = "id_inv_nb", nullable = false)
	public long getIdInvNb() {
		return this.idInvNb;
	}

	public void setIdInvNb(long idInvNb) {
		this.idInvNb = idInvNb;
	}

	@Column(name = "id_sku_nb", nullable = false)
	public long getIdSkuNb() {
		return this.idSkuNb;
	}

	public void setIdSkuNb(long idSkuNb) {
		this.idSkuNb = idSkuNb;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InvoiceDetailId))
			return false;
		InvoiceDetailId castOther = (InvoiceDetailId) other;

		return (this.getIdInvNb() == castOther.getIdInvNb()) && (this.getIdSkuNb() == castOther.getIdSkuNb());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdInvNb();
		result = 37 * result + (int) this.getIdSkuNb();
		return result;
	}

}
