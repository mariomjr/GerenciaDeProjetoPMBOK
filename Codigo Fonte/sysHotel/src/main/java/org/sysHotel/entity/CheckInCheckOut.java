package org.sysHotel.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.sysHotel.enums.EnumAtivoInativo;
import org.sysHotel.enums.StatusOcupacao;

/**
 * @author MarioJr
 *
 */
@Entity
public class CheckInCheckOut {

	@Id
	@GeneratedValue
	private Long id;
	
	private Calendar dataCheckIn;
	
	private Calendar dataCheckOut;
	
	private Reserva reserva;
	
	private EnumAtivoInativo ativoInativo;
	
	private StatusOcupacao situacao;
	
	@Transient
	private List<ServicoQuarto> listServicosQuarto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDataCheckIn() {
		return dataCheckIn;
	}

	public void setDataCheckIn(Calendar dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}

	public Calendar getDataCheckOut() {
		return dataCheckOut;
	}

	public void setDataCheckOut(Calendar dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public EnumAtivoInativo getAtivoInativo() {
		return ativoInativo;
	}

	public void setAtivoInativo(EnumAtivoInativo ativoInativo) {
		this.ativoInativo = ativoInativo;
	}

	public StatusOcupacao getSituacao() {
		return situacao;
	}

	public void setSituacao(StatusOcupacao situacao) {
		this.situacao = situacao;
	}

	public List<ServicoQuarto> getListServicosQuarto() {
		if(listServicosQuarto == null){
			listServicosQuarto = new ArrayList<ServicoQuarto>();
		}
		return listServicosQuarto;
	}

	public void setListServicosQuarto(List<ServicoQuarto> listServicosQuarto) {
		this.listServicosQuarto = listServicosQuarto;
	}
	
}
