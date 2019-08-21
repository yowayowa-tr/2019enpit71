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

package jp.co.enpit.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Pamphlet service. Represents a row in the &quot;Pamphlet_Pamphlet&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PamphletModel
 * @generated
 */
@ImplementationClassName("jp.co.enpit.model.impl.PamphletImpl")
@ProviderType
public interface Pamphlet extends PamphletModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>jp.co.enpit.model.impl.PamphletImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Pamphlet, Long> PAMPHLET_ID_ACCESSOR =
		new Accessor<Pamphlet, Long>() {

			@Override
			public Long get(Pamphlet pamphlet) {
				return pamphlet.getPamphletId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Pamphlet> getTypeClass() {
				return Pamphlet.class;
			}

		};

}