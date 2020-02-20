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

package com.liveray.client.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link ClienteLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ClienteLocalService
 * @generated
 */
@ProviderType
public class ClienteLocalServiceWrapper
	implements ClienteLocalService, ServiceWrapper<ClienteLocalService> {

	public ClienteLocalServiceWrapper(ClienteLocalService clienteLocalService) {
		_clienteLocalService = clienteLocalService;
	}

	/**
	 * Adds the cliente to the database. Also notifies the appropriate model listeners.
	 *
	 * @param cliente the cliente
	 * @return the cliente that was added
	 */
	@Override
	public com.liveray.client.service.model.Cliente addCliente(
		com.liveray.client.service.model.Cliente cliente) {

		return _clienteLocalService.addCliente(cliente);
	}

	/**
	 * Creates a new cliente with the primary key. Does not add the cliente to the database.
	 *
	 * @param clienteId the primary key for the new cliente
	 * @return the new cliente
	 */
	@Override
	public com.liveray.client.service.model.Cliente createCliente(
		long clienteId) {

		return _clienteLocalService.createCliente(clienteId);
	}

	/**
	 * Deletes the cliente from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cliente the cliente
	 * @return the cliente that was removed
	 */
	@Override
	public com.liveray.client.service.model.Cliente deleteCliente(
		com.liveray.client.service.model.Cliente cliente) {

		return _clienteLocalService.deleteCliente(cliente);
	}

	/**
	 * Deletes the cliente with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente that was removed
	 * @throws PortalException if a cliente with the primary key could not be found
	 */
	@Override
	public com.liveray.client.service.model.Cliente deleteCliente(
			long clienteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _clienteLocalService.deleteCliente(clienteId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _clienteLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _clienteLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _clienteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liveray.client.service.model.impl.ClienteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _clienteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liveray.client.service.model.impl.ClienteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _clienteLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _clienteLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _clienteLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liveray.client.service.model.Cliente fetchCliente(
		long clienteId) {

		return _clienteLocalService.fetchCliente(clienteId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _clienteLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cliente with the primary key.
	 *
	 * @param clienteId the primary key of the cliente
	 * @return the cliente
	 * @throws PortalException if a cliente with the primary key could not be found
	 */
	@Override
	public com.liveray.client.service.model.Cliente getCliente(long clienteId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _clienteLocalService.getCliente(clienteId);
	}

	/**
	 * Returns a range of all the clientes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liveray.client.service.model.impl.ClienteModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of clientes
	 * @param end the upper bound of the range of clientes (not inclusive)
	 * @return the range of clientes
	 */
	@Override
	public java.util.List<com.liveray.client.service.model.Cliente> getClientes(
		int start, int end) {

		return _clienteLocalService.getClientes(start, end);
	}

	/**
	 * Returns the number of clientes.
	 *
	 * @return the number of clientes
	 */
	@Override
	public int getClientesCount() {
		return _clienteLocalService.getClientesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _clienteLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _clienteLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _clienteLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public void saveCliente(
		String rg, String nome, String nomeMae, String nomePai,
		String orgaoExpedidor, String estado, java.util.Date dataExpedicao) {

		_clienteLocalService.saveCliente(
			rg, nome, nomeMae, nomePai, orgaoExpedidor, estado, dataExpedicao);
	}

	/**
	 * Updates the cliente in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param cliente the cliente
	 * @return the cliente that was updated
	 */
	@Override
	public com.liveray.client.service.model.Cliente updateCliente(
		com.liveray.client.service.model.Cliente cliente) {

		return _clienteLocalService.updateCliente(cliente);
	}

	@Override
	public ClienteLocalService getWrappedService() {
		return _clienteLocalService;
	}

	@Override
	public void setWrappedService(ClienteLocalService clienteLocalService) {
		_clienteLocalService = clienteLocalService;
	}

	private ClienteLocalService _clienteLocalService;

}