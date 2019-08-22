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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import jp.co.enpit.exception.NoSuchPamphletException;
import jp.co.enpit.model.Pamphlet;

/**
 * The persistence interface for the pamphlet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PamphletUtil
 * @generated
 */
@ProviderType
public interface PamphletPersistence extends BasePersistence<Pamphlet> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PamphletUtil} to access the pamphlet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Pamphlet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the pamphlets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching pamphlets
	 */
	public java.util.List<Pamphlet> findByUuid(String uuid);

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
	public java.util.List<Pamphlet> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Pamphlet> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator);

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
	public java.util.List<Pamphlet> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public Pamphlet findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
				orderByComparator)
		throws NoSuchPamphletException;

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public Pamphlet fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator);

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public Pamphlet findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
				orderByComparator)
		throws NoSuchPamphletException;

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public Pamphlet fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator);

	/**
	 * Returns the pamphlets before and after the current pamphlet in the ordered set where uuid = &#63;.
	 *
	 * @param pamphletId the primary key of the current pamphlet
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public Pamphlet[] findByUuid_PrevAndNext(
			long pamphletId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
				orderByComparator)
		throws NoSuchPamphletException;

	/**
	 * Removes all the pamphlets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of pamphlets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching pamphlets
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the pamphlet where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPamphletException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public Pamphlet findByUUID_G(String uuid, long groupId)
		throws NoSuchPamphletException;

	/**
	 * Returns the pamphlet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public Pamphlet fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the pamphlet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public Pamphlet fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the pamphlet where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the pamphlet that was removed
	 */
	public Pamphlet removeByUUID_G(String uuid, long groupId)
		throws NoSuchPamphletException;

	/**
	 * Returns the number of pamphlets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching pamphlets
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the pamphlets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching pamphlets
	 */
	public java.util.List<Pamphlet> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Pamphlet> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Pamphlet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator);

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
	public java.util.List<Pamphlet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public Pamphlet findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
				orderByComparator)
		throws NoSuchPamphletException;

	/**
	 * Returns the first pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public Pamphlet fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator);

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet
	 * @throws NoSuchPamphletException if a matching pamphlet could not be found
	 */
	public Pamphlet findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
				orderByComparator)
		throws NoSuchPamphletException;

	/**
	 * Returns the last pamphlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pamphlet, or <code>null</code> if a matching pamphlet could not be found
	 */
	public Pamphlet fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator);

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
	public Pamphlet[] findByUuid_C_PrevAndNext(
			long pamphletId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
				orderByComparator)
		throws NoSuchPamphletException;

	/**
	 * Removes all the pamphlets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of pamphlets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching pamphlets
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the pamphlet in the entity cache if it is enabled.
	 *
	 * @param pamphlet the pamphlet
	 */
	public void cacheResult(Pamphlet pamphlet);

	/**
	 * Caches the pamphlets in the entity cache if it is enabled.
	 *
	 * @param pamphlets the pamphlets
	 */
	public void cacheResult(java.util.List<Pamphlet> pamphlets);

	/**
	 * Creates a new pamphlet with the primary key. Does not add the pamphlet to the database.
	 *
	 * @param pamphletId the primary key for the new pamphlet
	 * @return the new pamphlet
	 */
	public Pamphlet create(long pamphletId);

	/**
	 * Removes the pamphlet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet that was removed
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public Pamphlet remove(long pamphletId) throws NoSuchPamphletException;

	public Pamphlet updateImpl(Pamphlet pamphlet);

	/**
	 * Returns the pamphlet with the primary key or throws a <code>NoSuchPamphletException</code> if it could not be found.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet
	 * @throws NoSuchPamphletException if a pamphlet with the primary key could not be found
	 */
	public Pamphlet findByPrimaryKey(long pamphletId)
		throws NoSuchPamphletException;

	/**
	 * Returns the pamphlet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pamphletId the primary key of the pamphlet
	 * @return the pamphlet, or <code>null</code> if a pamphlet with the primary key could not be found
	 */
	public Pamphlet fetchByPrimaryKey(long pamphletId);

	/**
	 * Returns all the pamphlets.
	 *
	 * @return the pamphlets
	 */
	public java.util.List<Pamphlet> findAll();

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
	public java.util.List<Pamphlet> findAll(int start, int end);

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
	public java.util.List<Pamphlet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator);

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
	public java.util.List<Pamphlet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pamphlet>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the pamphlets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pamphlets.
	 *
	 * @return the number of pamphlets
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}