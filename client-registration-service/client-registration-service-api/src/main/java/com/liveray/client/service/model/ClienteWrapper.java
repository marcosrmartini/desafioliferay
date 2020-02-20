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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Cliente}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cliente
 * @generated
 */
@ProviderType
public class ClienteWrapper
	extends BaseModelWrapper<Cliente>
	implements Cliente, ModelWrapper<Cliente> {

	public ClienteWrapper(Cliente cliente) {
		super(cliente);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("clienteId", getClienteId());
		attributes.put("planoId", getPlanoId());
		attributes.put("nome", getNome());
		attributes.put("rg", getRg());
		attributes.put("nomeMae", getNomeMae());
		attributes.put("nomePai", getNomePai());
		attributes.put("orgaoExpedidor", getOrgaoExpedidor());
		attributes.put("estado", getEstado());
		attributes.put("dataExpedicao", getDataExpedicao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long clienteId = (Long)attributes.get("clienteId");

		if (clienteId != null) {
			setClienteId(clienteId);
		}

		Long planoId = (Long)attributes.get("planoId");

		if (planoId != null) {
			setPlanoId(planoId);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String rg = (String)attributes.get("rg");

		if (rg != null) {
			setRg(rg);
		}

		String nomeMae = (String)attributes.get("nomeMae");

		if (nomeMae != null) {
			setNomeMae(nomeMae);
		}

		String nomePai = (String)attributes.get("nomePai");

		if (nomePai != null) {
			setNomePai(nomePai);
		}

		String orgaoExpedidor = (String)attributes.get("orgaoExpedidor");

		if (orgaoExpedidor != null) {
			setOrgaoExpedidor(orgaoExpedidor);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		Date dataExpedicao = (Date)attributes.get("dataExpedicao");

		if (dataExpedicao != null) {
			setDataExpedicao(dataExpedicao);
		}
	}

	/**
	 * Returns the cliente ID of this cliente.
	 *
	 * @return the cliente ID of this cliente
	 */
	@Override
	public long getClienteId() {
		return model.getClienteId();
	}

	/**
	 * Returns the data expedicao of this cliente.
	 *
	 * @return the data expedicao of this cliente
	 */
	@Override
	public Date getDataExpedicao() {
		return model.getDataExpedicao();
	}

	/**
	 * Returns the estado of this cliente.
	 *
	 * @return the estado of this cliente
	 */
	@Override
	public String getEstado() {
		return model.getEstado();
	}

	/**
	 * Returns the nome of this cliente.
	 *
	 * @return the nome of this cliente
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the nome mae of this cliente.
	 *
	 * @return the nome mae of this cliente
	 */
	@Override
	public String getNomeMae() {
		return model.getNomeMae();
	}

	/**
	 * Returns the nome pai of this cliente.
	 *
	 * @return the nome pai of this cliente
	 */
	@Override
	public String getNomePai() {
		return model.getNomePai();
	}

	/**
	 * Returns the orgao expedidor of this cliente.
	 *
	 * @return the orgao expedidor of this cliente
	 */
	@Override
	public String getOrgaoExpedidor() {
		return model.getOrgaoExpedidor();
	}

	/**
	 * Returns the plano ID of this cliente.
	 *
	 * @return the plano ID of this cliente
	 */
	@Override
	public long getPlanoId() {
		return model.getPlanoId();
	}

	/**
	 * Returns the primary key of this cliente.
	 *
	 * @return the primary key of this cliente
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rg of this cliente.
	 *
	 * @return the rg of this cliente
	 */
	@Override
	public String getRg() {
		return model.getRg();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cliente ID of this cliente.
	 *
	 * @param clienteId the cliente ID of this cliente
	 */
	@Override
	public void setClienteId(long clienteId) {
		model.setClienteId(clienteId);
	}

	/**
	 * Sets the data expedicao of this cliente.
	 *
	 * @param dataExpedicao the data expedicao of this cliente
	 */
	@Override
	public void setDataExpedicao(Date dataExpedicao) {
		model.setDataExpedicao(dataExpedicao);
	}

	/**
	 * Sets the estado of this cliente.
	 *
	 * @param estado the estado of this cliente
	 */
	@Override
	public void setEstado(String estado) {
		model.setEstado(estado);
	}

	/**
	 * Sets the nome of this cliente.
	 *
	 * @param nome the nome of this cliente
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the nome mae of this cliente.
	 *
	 * @param nomeMae the nome mae of this cliente
	 */
	@Override
	public void setNomeMae(String nomeMae) {
		model.setNomeMae(nomeMae);
	}

	/**
	 * Sets the nome pai of this cliente.
	 *
	 * @param nomePai the nome pai of this cliente
	 */
	@Override
	public void setNomePai(String nomePai) {
		model.setNomePai(nomePai);
	}

	/**
	 * Sets the orgao expedidor of this cliente.
	 *
	 * @param orgaoExpedidor the orgao expedidor of this cliente
	 */
	@Override
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		model.setOrgaoExpedidor(orgaoExpedidor);
	}

	/**
	 * Sets the plano ID of this cliente.
	 *
	 * @param planoId the plano ID of this cliente
	 */
	@Override
	public void setPlanoId(long planoId) {
		model.setPlanoId(planoId);
	}

	/**
	 * Sets the primary key of this cliente.
	 *
	 * @param primaryKey the primary key of this cliente
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rg of this cliente.
	 *
	 * @param rg the rg of this cliente
	 */
	@Override
	public void setRg(String rg) {
		model.setRg(rg);
	}

	@Override
	protected ClienteWrapper wrap(Cliente cliente) {
		return new ClienteWrapper(cliente);
	}

}