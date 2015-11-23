/**
 * 
 */
package com.framework.metadata.model;

/**
 * @author HWYan
 * 
 */
public abstract class ModelElement {

	private String name;

	private String displayName;

	private String description;

	private String extendedProperties;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setExtendedProperties(String extendedProperties) {
		this.extendedProperties = extendedProperties;
	}

	public String getExtendedProperty(String key) {
		if (extendedProperties != null) {
			String[] tmpProperties = extendedProperties.split("[,;]");
			for (String tmpProperty : tmpProperties) {
				String[] strs = tmpProperty.split("=", 2);
				if (strs[0].trim().equals(key)) {
					return strs[1];
				}
			}
		}
		return null;
	}

}
