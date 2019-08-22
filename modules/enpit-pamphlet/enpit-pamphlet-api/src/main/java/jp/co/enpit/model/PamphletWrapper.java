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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Pamphlet}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Pamphlet
 * @generated
 */
@ProviderType
public class PamphletWrapper implements Pamphlet, ModelWrapper<Pamphlet> {

	public PamphletWrapper(Pamphlet pamphlet) {
		_pamphlet = pamphlet;
	}

	@Override
	public Class<?> getModelClass() {
		return Pamphlet.class;
	}

	@Override
	public String getModelClassName() {
		return Pamphlet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("pamphletId", getPamphletId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long pamphletId = (Long)attributes.get("pamphletId");

		if (pamphletId != null) {
			setPamphletId(pamphletId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@Override
	public Object clone() {
		return new PamphletWrapper((Pamphlet)_pamphlet.clone());
	}

	@Override
	public int compareTo(jp.co.enpit.model.Pamphlet pamphlet) {
		return _pamphlet.compareTo(pamphlet);
	}

	/**
	 * Returns the company ID of this pamphlet.
	 *
	 * @return the company ID of this pamphlet
	 */
	@Override
	public long getCompanyId() {
		return _pamphlet.getCompanyId();
	}

	/**
	 * Returns the content of this pamphlet.
	 *
	 * @return the content of this pamphlet
	 */
	@Override
	public String getContent() {
		return _pamphlet.getContent();
	}

	/**
	 * Returns the create date of this pamphlet.
	 *
	 * @return the create date of this pamphlet
	 */
	@Override
	public Date getCreateDate() {
		return _pamphlet.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pamphlet.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this pamphlet.
	 *
	 * @return the group ID of this pamphlet
	 */
	@Override
	public long getGroupId() {
		return _pamphlet.getGroupId();
	}

	/**
	 * Returns the modified date of this pamphlet.
	 *
	 * @return the modified date of this pamphlet
	 */
	@Override
	public Date getModifiedDate() {
		return _pamphlet.getModifiedDate();
	}

	/**
	 * Returns the pamphlet ID of this pamphlet.
	 *
	 * @return the pamphlet ID of this pamphlet
	 */
	@Override
	public long getPamphletId() {
		return _pamphlet.getPamphletId();
	}

	/**
	 * Returns the primary key of this pamphlet.
	 *
	 * @return the primary key of this pamphlet
	 */
	@Override
	public long getPrimaryKey() {
		return _pamphlet.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pamphlet.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this pamphlet.
	 *
	 * @return the user ID of this pamphlet
	 */
	@Override
	public long getUserId() {
		return _pamphlet.getUserId();
	}

	/**
	 * Returns the user name of this pamphlet.
	 *
	 * @return the user name of this pamphlet
	 */
	@Override
	public String getUserName() {
		return _pamphlet.getUserName();
	}

	/**
	 * Returns the user uuid of this pamphlet.
	 *
	 * @return the user uuid of this pamphlet
	 */
	@Override
	public String getUserUuid() {
		return _pamphlet.getUserUuid();
	}

	/**
	 * Returns the uuid of this pamphlet.
	 *
	 * @return the uuid of this pamphlet
	 */
	@Override
	public String getUuid() {
		return _pamphlet.getUuid();
	}

	@Override
	public int hashCode() {
		return _pamphlet.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _pamphlet.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pamphlet.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pamphlet.isNew();
	}

	@Override
	public void persist() {
		_pamphlet.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pamphlet.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this pamphlet.
	 *
	 * @param companyId the company ID of this pamphlet
	 */
	@Override
	public void setCompanyId(long companyId) {
		_pamphlet.setCompanyId(companyId);
	}

	/**
	 * Sets the content of this pamphlet.
	 *
	 * @param content the content of this pamphlet
	 */
	@Override
	public void setContent(String content) {
		_pamphlet.setContent(content);
	}

	/**
	 * Sets the create date of this pamphlet.
	 *
	 * @param createDate the create date of this pamphlet
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_pamphlet.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_pamphlet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pamphlet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pamphlet.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this pamphlet.
	 *
	 * @param groupId the group ID of this pamphlet
	 */
	@Override
	public void setGroupId(long groupId) {
		_pamphlet.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this pamphlet.
	 *
	 * @param modifiedDate the modified date of this pamphlet
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_pamphlet.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_pamphlet.setNew(n);
	}

	/**
	 * Sets the pamphlet ID of this pamphlet.
	 *
	 * @param pamphletId the pamphlet ID of this pamphlet
	 */
	@Override
	public void setPamphletId(long pamphletId) {
		_pamphlet.setPamphletId(pamphletId);
	}

	/**
	 * Sets the primary key of this pamphlet.
	 *
	 * @param primaryKey the primary key of this pamphlet
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pamphlet.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pamphlet.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this pamphlet.
	 *
	 * @param userId the user ID of this pamphlet
	 */
	@Override
	public void setUserId(long userId) {
		_pamphlet.setUserId(userId);
	}

	/**
	 * Sets the user name of this pamphlet.
	 *
	 * @param userName the user name of this pamphlet
	 */
	@Override
	public void setUserName(String userName) {
		_pamphlet.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pamphlet.
	 *
	 * @param userUuid the user uuid of this pamphlet
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_pamphlet.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this pamphlet.
	 *
	 * @param uuid the uuid of this pamphlet
	 */
	@Override
	public void setUuid(String uuid) {
		_pamphlet.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<jp.co.enpit.model.Pamphlet> toCacheModel() {

		return _pamphlet.toCacheModel();
	}

	@Override
	public jp.co.enpit.model.Pamphlet toEscapedModel() {
		return new PamphletWrapper(_pamphlet.toEscapedModel());
	}

	@Override
	public String toString() {
		return _pamphlet.toString();
	}

	@Override
	public jp.co.enpit.model.Pamphlet toUnescapedModel() {
		return new PamphletWrapper(_pamphlet.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _pamphlet.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PamphletWrapper)) {
			return false;
		}

		PamphletWrapper pamphletWrapper = (PamphletWrapper)obj;

		if (Objects.equals(_pamphlet, pamphletWrapper._pamphlet)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _pamphlet.getStagedModelType();
	}

	@Override
	public Pamphlet getWrappedModel() {
		return _pamphlet;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pamphlet.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pamphlet.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pamphlet.resetOriginalValues();
	}

	private final Pamphlet _pamphlet;

}