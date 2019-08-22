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

package jp.co.enpit.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import jp.co.enpit.model.Pamphlet;

/**
 * The cache model class for representing Pamphlet in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PamphletCacheModel
	implements CacheModel<Pamphlet>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PamphletCacheModel)) {
			return false;
		}

		PamphletCacheModel pamphletCacheModel = (PamphletCacheModel)obj;

		if (pamphletId == pamphletCacheModel.pamphletId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pamphletId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", pamphletId=");
		sb.append(pamphletId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", content=");
		sb.append(content);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pamphlet toEntityModel() {
		PamphletImpl pamphletImpl = new PamphletImpl();

		if (uuid == null) {
			pamphletImpl.setUuid("");
		}
		else {
			pamphletImpl.setUuid(uuid);
		}

		pamphletImpl.setPamphletId(pamphletId);
		pamphletImpl.setGroupId(groupId);
		pamphletImpl.setCompanyId(companyId);
		pamphletImpl.setUserId(userId);

		if (userName == null) {
			pamphletImpl.setUserName("");
		}
		else {
			pamphletImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pamphletImpl.setCreateDate(null);
		}
		else {
			pamphletImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pamphletImpl.setModifiedDate(null);
		}
		else {
			pamphletImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (content == null) {
			pamphletImpl.setContent("");
		}
		else {
			pamphletImpl.setContent(content);
		}

		pamphletImpl.resetOriginalValues();

		return pamphletImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		pamphletId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		content = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(pamphletId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (content == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(content);
		}
	}

	public String uuid;
	public long pamphletId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String content;

}