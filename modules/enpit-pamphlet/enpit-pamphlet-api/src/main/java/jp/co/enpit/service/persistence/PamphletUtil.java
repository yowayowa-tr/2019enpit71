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

package jp.co.enpit.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.co.enpit.model.Pamphlet;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the pamphlet service. This utility wraps <code>jp.co.enpit.service.persistence.impl.PamphletPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PamphletPersistence
 * @generated
 */
@ProviderType
public class PamphletUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Pamphlet pamphlet) {
		getPersistence().clearCache(pamphlet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Pamphlet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Pamphlet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pamphlet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pamphlet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Pamphlet update(Pamphlet pamphlet) {
		return getPersistence().update(pamphlet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Pamphlet update(
		Pamphlet pamphlet, ServiceContext serviceContext) {

		return getPersistence().update(pamphlet, serviceContext);
	}

	/**
	 * Returns all the pamphlets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching pamphlets
	 */
	public static List<Pamphlet> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the pamphlets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @return the range of matching pamphlets
	 */
	public static List<Pamphlet> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the pamphlets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pamphlets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByUuid_First(
			String uuid, OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByUuid_First(
		String uuid, OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByUuid_Last(
			String uuid, OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByUuid_Last(
		String uuid, OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the pamphlets before and after the current pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param pamphletId the primary key of the current pamphlet
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet[] findByUuid_PrevAndNext(
			long pamphletId, String uuid,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByUuid_PrevAndNext(
			pamphletId, uuid, orderByComparator);
	}

	/**
	 * Removes all the pamphlets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of pamphlets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching pamphlets
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the pamphlet where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPamphletException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByUUID_G(String uuid, long groupId)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the pamphlet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the pamphlet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the pamphlet where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the pamphlet that was removed
	 */
	public static Pamphlet removeByUUID_G(String uuid, long groupId)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of pamphlets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching pamphlets
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the pamphlets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching pamphlets
	 */
	public static List<Pamphlet> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the pamphlets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @return the range of matching pamphlets
	 */
	public static List<Pamphlet> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the pamphlets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pamphlets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the pamphlets before and after the current pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param pamphletId the primary key of the current pamphlet
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet[] findByUuid_C_PrevAndNext(
			long pamphletId, String uuid, long companyId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByUuid_C_PrevAndNext(
			pamphletId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the pamphlets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of pamphlets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching pamphlets
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the pamphlets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching pamphlets
	 */
	public static List<Pamphlet> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the pamphlets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @return the range of matching pamphlets
	 */
	public static List<Pamphlet> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the pamphlets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pamphlets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first pamphlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByGroupId_First(
			long groupId, OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first pamphlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByGroupId_First(
		long groupId, OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByGroupId_Last(
			long groupId, OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByGroupId_Last(
		long groupId, OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the pamphlets before and after the current pamphlet in the ordered set where groupId = &#63;.
	 *
	 * @param pamphletId the primary key of the current pamphlet
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet[] findByGroupId_PrevAndNext(
			long pamphletId, long groupId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByGroupId_PrevAndNext(
			pamphletId, groupId, orderByComparator);
	}

	/**
	 * Removes all the pamphlets where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of pamphlets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching pamphlets
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the pamphlets where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @return the matching pamphlets
	 */
	public static List<Pamphlet> findByLI(long locationId) {
		return getPersistence().findByLI(locationId);
	}

	/**
	 * Returns a range of all the pamphlets where locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @return the range of matching pamphlets
	 */
	public static List<Pamphlet> findByLI(long locationId, int start, int end) {
		return getPersistence().findByLI(locationId, start, end);
	}

	/**
	 * Returns an ordered range of all the pamphlets where locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByLI(
		long locationId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().findByLI(
			locationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pamphlets where locationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByLI(
		long locationId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByLI(
			locationId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first pamphlet in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByLI_First(
			long locationId, OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByLI_First(locationId, orderByComparator);
	}

	/**
	 * Returns the first pamphlet in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByLI_First(
		long locationId, OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByLI_First(locationId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByLI_Last(
			long locationId, OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByLI_Last(locationId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByLI_Last(
		long locationId, OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByLI_Last(locationId, orderByComparator);
	}

	/**
	 * Returns the pamphlets before and after the current pamphlet in the ordered set where locationId = &#63;.
	 *
	 * @param pamphletId the primary key of the current pamphlet
	 * @param locationId the location ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet[] findByLI_PrevAndNext(
			long pamphletId, long locationId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByLI_PrevAndNext(
			pamphletId, locationId, orderByComparator);
	}

	/**
	 * Removes all the pamphlets where locationId = &#63; from the database.
	 *
	 * @param locationId the location ID
	 */
	public static void removeByLI(long locationId) {
		getPersistence().removeByLI(locationId);
	}

	/**
	 * Returns the number of pamphlets where locationId = &#63;.
	 *
	 * @param locationId the location ID
	 * @return the number of matching pamphlets
	 */
	public static int countByLI(long locationId) {
		return getPersistence().countByLI(locationId);
	}

	/**
	 * Returns all the pamphlets where locationId = &#63; and groupId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @return the matching pamphlets
	 */
	public static List<Pamphlet> findByLI_G(long locationId, long groupId) {
		return getPersistence().findByLI_G(locationId, groupId);
	}

	/**
	 * Returns a range of all the pamphlets where locationId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @return the range of matching pamphlets
	 */
	public static List<Pamphlet> findByLI_G(
		long locationId, long groupId, int start, int end) {

		return getPersistence().findByLI_G(locationId, groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the pamphlets where locationId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByLI_G(
		long locationId, long groupId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().findByLI_G(
			locationId, groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pamphlets where locationId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching pamphlets
	 */
	public static List<Pamphlet> findByLI_G(
		long locationId, long groupId, int start, int end,
		OrderByComparator<Pamphlet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByLI_G(
			locationId, groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first pamphlet in the ordered set where locationId = &#63; and groupId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByLI_G_First(
			long locationId, long groupId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByLI_G_First(
			locationId, groupId, orderByComparator);
	}

	/**
	 * Returns the first pamphlet in the ordered set where locationId = &#63; and groupId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByLI_G_First(
		long locationId, long groupId,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByLI_G_First(
			locationId, groupId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where locationId = &#63; and groupId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public static Pamphlet findByLI_G_Last(
			long locationId, long groupId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByLI_G_Last(
			locationId, groupId, orderByComparator);
	}

	/**
	 * Returns the last pamphlet in the ordered set where locationId = &#63; and groupId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public static Pamphlet fetchByLI_G_Last(
		long locationId, long groupId,
		OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().fetchByLI_G_Last(
			locationId, groupId, orderByComparator);
	}

	/**
	 * Returns the pamphlets before and after the current pamphlet in the ordered set where locationId = &#63; and groupId = &#63;.
	 *
	 * @param pamphletId the primary key of the current pamphlet
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet[] findByLI_G_PrevAndNext(
			long pamphletId, long locationId, long groupId,
			OrderByComparator<Pamphlet> orderByComparator)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByLI_G_PrevAndNext(
			pamphletId, locationId, groupId, orderByComparator);
	}

	/**
	 * Removes all the pamphlets where locationId = &#63; and groupId = &#63; from the database.
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 */
	public static void removeByLI_G(long locationId, long groupId) {
		getPersistence().removeByLI_G(locationId, groupId);
	}

	/**
	 * Returns the number of pamphlets where locationId = &#63; and groupId = &#63;.
	 *
	 * @param locationId the location ID
	 * @param groupId the group ID
	 * @return the number of matching pamphlets
	 */
	public static int countByLI_G(long locationId, long groupId) {
		return getPersistence().countByLI_G(locationId, groupId);
	}

	/**
	 * Caches the pamphlet in the entity cache if it is enabled.
	 *
	 * @param pamphlet the pamphlet
	 */
	public static void cacheResult(Pamphlet pamphlet) {
		getPersistence().cacheResult(pamphlet);
	}

	/**
	 * Caches the pamphlets in the entity cache if it is enabled.
	 *
	 * @param pamphlets the pamphlets
	 */
	public static void cacheResult(List<Pamphlet> pamphlets) {
		getPersistence().cacheResult(pamphlets);
	}

	/**
	 * Creates a new pamphlet with the primary key. Does not add the pamphlet to the database.
	 *
	 * @param pamphletId the primary key for the new pamphlet
	 * @return the new pamphlet
	 */
	public static Pamphlet create(long pamphletId) {
		return getPersistence().create(pamphletId);
	}

	/**
	 * Removes the pamphlet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet that was removed
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet remove(long pamphletId)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().remove(pamphletId);
	}

	public static Pamphlet updateImpl(Pamphlet pamphlet) {
		return getPersistence().updateImpl(pamphlet);
	}

	/**
	 * Returns the pamphlet with the primary key or throws a <code>NoSuchPamphletException</code> if it could not be found.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet findByPrimaryKey(long pamphletId)
		throws jp.co.enpit.exception.NoSuchPamphletException {

		return getPersistence().findByPrimaryKey(pamphletId);
	}

	/**
	 * Returns the pamphlet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet, or <code>null</code> if a pamphlet with the primary key could not be found
	 */
	public static Pamphlet fetchByPrimaryKey(long pamphletId) {
		return getPersistence().fetchByPrimaryKey(pamphletId);
	}

	/**
	 * Returns all the pamphlets.
	 *
	 * @return the pamphlets
	 */
	public static List<Pamphlet> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pamphlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @return the range of pamphlets
	 */
	public static List<Pamphlet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pamphlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pamphlets
	 */
	public static List<Pamphlet> findAll(
		int start, int end, OrderByComparator<Pamphlet> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pamphlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PamphletModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pamphlets
	 * @param end the upper bound of the range of pamphlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of pamphlets
	 */
	public static List<Pamphlet> findAll(
		int start, int end, OrderByComparator<Pamphlet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the pamphlets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pamphlets.
	 *
	 * @return the number of pamphlets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PamphletPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PamphletPersistence, PamphletPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PamphletPersistence.class);

		ServiceTracker<PamphletPersistence, PamphletPersistence>
			serviceTracker =
				new ServiceTracker<PamphletPersistence, PamphletPersistence>(
					bundle.getBundleContext(), PamphletPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}