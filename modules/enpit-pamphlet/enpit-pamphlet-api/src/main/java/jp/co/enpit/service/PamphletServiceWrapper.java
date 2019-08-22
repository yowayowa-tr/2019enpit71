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
 * Provides a wrapper for {@link PamphletService}.
 *
 * @author Brian Wing Shun Chan
 * @see PamphletService
 * @generated
 */
@ProviderType
public class PamphletServiceWrapper
	implements PamphletService, ServiceWrapper<PamphletService> {

	public PamphletServiceWrapper(PamphletService pamphletService) {
		_pamphletService = pamphletService;
	}

	@Override
	public jp.co.enpit.model.Pamphlet addEntry(
			long locationId, String content,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pamphletService.addEntry(locationId, content, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pamphletService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<jp.co.enpit.model.Pamphlet> getPamphlets(
		long locationId, int start, int end) {

		return _pamphletService.getPamphlets(locationId, start, end);
	}

	@Override
	public PamphletService getWrappedService() {
		return _pamphletService;
	}

	@Override
	public void setWrappedService(PamphletService pamphletService) {
		_pamphletService = pamphletService;
	}

	private PamphletService _pamphletService;

}