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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Pamphlet. This utility wraps
 * <code>jp.co.enpit.service.impl.PamphletServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PamphletService
 * @generated
 */
@ProviderType
public class PamphletServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>jp.co.enpit.service.impl.PamphletServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static jp.co.enpit.model.Pamphlet addEntry(
			long locationId, String content,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addEntry(locationId, content, serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<jp.co.enpit.model.Pamphlet> getPamphlets(
		long locationId, int start, int end) {

		return getService().getPamphlets(locationId, start, end);
	}

	public static PamphletService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PamphletService, PamphletService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PamphletService.class);

		ServiceTracker<PamphletService, PamphletService> serviceTracker =
			new ServiceTracker<PamphletService, PamphletService>(
				bundle.getBundleContext(), PamphletService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}