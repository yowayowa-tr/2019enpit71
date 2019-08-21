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

package jp.co.enpit.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PamphletLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PamphletLocalService
 * @generated
 */
@ProviderType
public class PamphletLocalServiceWrapper
	implements PamphletLocalService, ServiceWrapper<PamphletLocalService> {

	public PamphletLocalServiceWrapper(
		PamphletLocalService pamphletLocalService) {

		_pamphletLocalService = pamphletLocalService;
	}

	/**
	 * Adds the pamphlet to the database. Also notifies the appropriate model listeners.
	 *
	 * @param pamphlet the pamphlet
	 * @return the pamphlet that was added
	 */
	@Override
	public jp.co.enpit.model.Pamphlet addPamphlet(
		jp.co.enpit.model.Pamphlet pamphlet) {

		return _pamphletLocalService.addPamphlet(pamphlet);
	}

	/**
	 * Creates a new pamphlet with the primary key. Does not add the pamphlet to the database.
	 *
	 * @param pamphletId the primary key for the new pamphlet
	 * @return the new pamphlet
	 */
	@Override
	public jp.co.enpit.model.Pamphlet createPamphlet(long pamphletId) {
		return _pamphletLocalService.createPamphlet(pamphletId);
	}

	/**
	 * Deletes the pamphlet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet that was removed
	 * @throws PortalException if a pamphlet with the primary key could not be found
	 */
	@Override
	public jp.co.enpit.model.Pamphlet deletePamphlet(long pamphletId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pamphletLocalService.deletePamphlet(pamphletId);
	}

	/**
	 * Deletes the pamphlet from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pamphlet the pamphlet
	 * @return the pamphlet that was removed
	 */
	@Override
	public jp.co.enpit.model.Pamphlet deletePamphlet(
		jp.co.enpit.model.Pamphlet pamphlet) {

		return _pamphletLocalService.deletePamphlet(pamphlet);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pamphletLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pamphletLocalService.dynamicQuery();
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

		return _pamphletLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>jp.co.enpit.model.impl.PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _pamphletLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>jp.co.enpit.model.impl.PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _pamphletLocalService.dynamicQuery(
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

		return _pamphletLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pamphletLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public jp.co.enpit.model.Pamphlet fetchPamphlet(long pamphletId) {
		return _pamphletLocalService.fetchPamphlet(pamphletId);
	}

	/**
	 * Returns the pamphlet matching the UUID and group.
	 *
	 * @param uuid the pamphlet's UUID
	 * @param groupId the primary key of the group
	 * @return the matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	@Override
	public jp.co.enpit.model.Pamphlet fetchPamphletByUuidAndGroupId(
		String uuid, long groupId) {

		return _pamphletLocalService.fetchPamphletByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pamphletLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _pamphletLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pamphletLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pamphletLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the pamphlet with the primary key.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet
	 * @throws PortalException if a pamphlet with the primary key could not be found
	 */
	@Override
	public jp.co.enpit.model.Pamphlet getPamphlet(long pamphletId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pamphletLocalService.getPamphlet(pamphletId);
	}

	/**
	 * Returns the pamphlet matching the UUID and group.
	 *
	 * @param uuid the pamphlet's UUID
	 * @param groupId the primary key of the group
	 * @return the matching pamphlet
	 * @throws PortalException if a matching pamphlet could not be found
	 */
	@Override
	public jp.co.enpit.model.Pamphlet getPamphletByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pamphletLocalService.getPamphletByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the pamphlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>jp.co.enpit.model.impl.PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @return the range of pamphlets
	 */
	@Override
	public java.util.List<jp.co.enpit.model.Pamphlet> getPamphlets(
		int start, int end) {

		return _pamphletLocalService.getPamphlets(start, end);
	}

	/**
	 * Returns all the pamphlets matching the UUID and company.
	 *
	 * @param uuid the UUID of the pamphlets
	 * @param companyId the primary key of the company
	 * @return the matching pamphlets, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<jp.co.enpit.model.Pamphlet>
		getPamphletsByUuidAndCompanyId(String uuid, long companyId) {

		return _pamphletLocalService.getPamphletsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of pamphlets matching the UUID and company.
	 *
	 * @param uuid the UUID of the pamphlets
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching pamphlets, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<jp.co.enpit.model.Pamphlet>
		getPamphletsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<jp.co.enpit.model.Pamphlet> orderByComparator) {

		return _pamphletLocalService.getPamphletsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of pamphlets.
	 *
	 * @return the number of pamphlets
	 */
	@Override
	public int getPamphletsCount() {
		return _pamphletLocalService.getPamphletsCount();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pamphletLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the pamphlet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param pamphlet the pamphlet
	 * @return the pamphlet that was updated
	 */
	@Override
	public jp.co.enpit.model.Pamphlet updatePamphlet(
		jp.co.enpit.model.Pamphlet pamphlet) {

		return _pamphletLocalService.updatePamphlet(pamphlet);
	}

	@Override
	public PamphletLocalService getWrappedService() {
		return _pamphletLocalService;
	}

	@Override
	public void setWrappedService(PamphletLocalService pamphletLocalService) {
		_pamphletLocalService = pamphletLocalService;
	}

	private PamphletLocalService _pamphletLocalService;

}