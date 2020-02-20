/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liveray.client.service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ClienteSoap implements Serializable {

	public static ClienteSoap toSoapModel(Cliente model) {
		ClienteSoap soapModel = new ClienteSoap();

		soapModel.setClienteId(model.getClienteId());
		soapModel.setPlanoId(model.getPlanoId());
		soapModel.setNome(model.getNome());
		soapModel.setRg(model.getRg());
		soapModel.setNomeMae(model.getNomeMae());
		soapModel.setNomePai(model.getNomePai());
		soapModel.setOrgaoExpedidor(model.getOrgaoExpedidor());
		soapModel.setEstado(model.getEstado());
		soapModel.setDataExpedicao(model.getDataExpedicao());

		return soapModel;
	}

	public static ClienteSoap[] toSoapModels(Cliente[] models) {
		ClienteSoap[] soapModels = new ClienteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ClienteSoap[][] toSoapModels(Cliente[][] models) {
		ClienteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ClienteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ClienteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ClienteSoap[] toSoapModels(List<Cliente> models) {
		List<ClienteSoap> soapModels = new ArrayList<ClienteSoap>(
			models.size());

		for (Cliente model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ClienteSoap[soapModels.size()]);
	}

	public ClienteSoap() {
	}

	public long getPrimaryKey() {
		return _clienteId;
	}

	public void setPrimaryKey(long pk) {
		setClienteId(pk);
	}

	public long getClienteId() {
		return _clienteId;
	}

	public void setClienteId(long clienteId) {
		_clienteId = clienteId;
	}

	public long getPlanoId() {
		return _planoId;
	}

	public void setPlanoId(long planoId) {
		_planoId = planoId;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getRg() {
		return _rg;
	}

	public void setRg(String rg) {
		_rg = rg;
	}

	public String getNomeMae() {
		return _nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		_nomeMae = nomeMae;
	}

	public String getNomePai() {
		return _nomePai;
	}

	public void setNomePai(String nomePai) {
		_nomePai = nomePai;
	}

	public String getOrgaoExpedidor() {
		return _orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		_orgaoExpedidor = orgaoExpedidor;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public Date getDataExpedicao() {
		return _dataExpedicao;
	}

	public void setDataExpedicao(Date dataExpedicao) {
		_dataExpedicao = dataExpedicao;
	}

	private long _clienteId;
	private long _planoId;
	private String _nome;
	private String _rg;
	private String _nomeMae;
	private String _nomePai;
	private String _orgaoExpedidor;
	private String _estado;
	private Date _dataExpedicao;

}