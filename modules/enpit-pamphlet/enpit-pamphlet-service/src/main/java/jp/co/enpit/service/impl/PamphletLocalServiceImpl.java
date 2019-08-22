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

package jp.co.enpit.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;

import jp.co.enpit.model.Pamphlet;
import jp.co.enpit.service.base.PamphletLocalServiceBaseImpl;

/**
 * The implementation of the pamphlet local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>jp.co.enpit.service.PamphletLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PamphletLocalServiceBaseImpl
 */
public class PamphletLocalServiceImpl extends PamphletLocalServiceBaseImpl {

	public Pamphlet addEntry(long locationId, String content, ServiceContext serviceContext) throws PortalException {
		long pamphletId = counterLocalService.increment();
		
		Pamphlet entry = pamphletPersistence.create(pamphletId);
		User user = userLocalService.getUser(serviceContext.getUserId());
		Date now = new Date();
		
		entry.setUserId(user.getUserId());
		entry.setUserName(user.getFullName());
		entry.setModifiedDate(now);
		entry.setCreateDate(now);
		entry.setLocationId(locationId);
		entry.setContent(content);
		entry.setUuid(serviceContext.getUuid());
		
		return pamphletPersistence.update(entry);
	}
}