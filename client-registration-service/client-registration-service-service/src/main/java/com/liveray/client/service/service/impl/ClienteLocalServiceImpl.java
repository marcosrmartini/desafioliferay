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

package com.liveray.client.service.service.impl;

import com.liferay.portal.aop.AopService;

import com.liveray.client.service.service.base.ClienteLocalServiceBaseImpl;
import com.liveray.client.service.model.Cliente;
import com.liveray.client.service.model.impl.*;
import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the cliente local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.liveray.client.service.service.ClienteLocalService</code>
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClienteLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.liveray.client.service.model.Cliente", service = AopService.class)
public class ClienteLocalServiceImpl extends ClienteLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.liveray.client.service.service.ClienteLocalService</code> via
	 * injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.liveray.client.service.service.ClienteLocalServiceUtil</code>.
	 */

	public void saveCliente(String rg, String nome, String nomeMae, String nomePai,
			String orgaoExpedidor, String estado, Date dataExpedicao) {
			Cliente c = new ClienteImpl();
			c.setRg(rg);
			c.setNome(nome);
			c.setNomeMae(nomeMae);
			c.setNomePai(nomePai);
			c.setOrgaoExpedidor(orgaoExpedidor);
			c.setEstado(estado);
			c.setDataExpedicao(dataExpedicao);
			updateCliente(c);

	}
}