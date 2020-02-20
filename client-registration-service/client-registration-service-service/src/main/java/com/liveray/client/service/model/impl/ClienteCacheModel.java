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

package com.liveray.client.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.liveray.client.service.model.Cliente;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Cliente in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class ClienteCacheModel implements CacheModel<Cliente>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClienteCacheModel)) {
			return false;
		}

		ClienteCacheModel clienteCacheModel = (ClienteCacheModel)obj;

		if (clienteId == clienteCacheModel.clienteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, clienteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{clienteId=");
		sb.append(clienteId);
		sb.append(", planoId=");
		sb.append(planoId);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", rg=");
		sb.append(rg);
		sb.append(", nomeMae=");
		sb.append(nomeMae);
		sb.append(", nomePai=");
		sb.append(nomePai);
		sb.append(", orgaoExpedidor=");
		sb.append(orgaoExpedidor);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", dataExpedicao=");
		sb.append(dataExpedicao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Cliente toEntityModel() {
		ClienteImpl clienteImpl = new ClienteImpl();

		clienteImpl.setClienteId(clienteId);
		clienteImpl.setPlanoId(planoId);

		if (nome == null) {
			clienteImpl.setNome("");
		}
		else {
			clienteImpl.setNome(nome);
		}

		if (rg == null) {
			clienteImpl.setRg("");
		}
		else {
			clienteImpl.setRg(rg);
		}

		if (nomeMae == null) {
			clienteImpl.setNomeMae("");
		}
		else {
			clienteImpl.setNomeMae(nomeMae);
		}

		if (nomePai == null) {
			clienteImpl.setNomePai("");
		}
		else {
			clienteImpl.setNomePai(nomePai);
		}

		if (orgaoExpedidor == null) {
			clienteImpl.setOrgaoExpedidor("");
		}
		else {
			clienteImpl.setOrgaoExpedidor(orgaoExpedidor);
		}

		if (estado == null) {
			clienteImpl.setEstado("");
		}
		else {
			clienteImpl.setEstado(estado);
		}

		if (dataExpedicao == Long.MIN_VALUE) {
			clienteImpl.setDataExpedicao(null);
		}
		else {
			clienteImpl.setDataExpedicao(new Date(dataExpedicao));
		}

		clienteImpl.resetOriginalValues();

		return clienteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		clienteId = objectInput.readLong();

		planoId = objectInput.readLong();
		nome = objectInput.readUTF();
		rg = objectInput.readUTF();
		nomeMae = objectInput.readUTF();
		nomePai = objectInput.readUTF();
		orgaoExpedidor = objectInput.readUTF();
		estado = objectInput.readUTF();
		dataExpedicao = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(clienteId);

		objectOutput.writeLong(planoId);

		if (nome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome);
		}

		if (rg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rg);
		}

		if (nomeMae == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nomeMae);
		}

		if (nomePai == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nomePai);
		}

		if (orgaoExpedidor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgaoExpedidor);
		}

		if (estado == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estado);
		}

		objectOutput.writeLong(dataExpedicao);
	}

	public long clienteId;
	public long planoId;
	public String nome;
	public String rg;
	public String nomeMae;
	public String nomePai;
	public String orgaoExpedidor;
	public String estado;
	public long dataExpedicao;

}