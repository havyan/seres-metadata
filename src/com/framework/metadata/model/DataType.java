/**
 * 
 */
package com.framework.metadata.model;

/**
 * @author HWYan
 *
 */
public enum DataType {
	
	INT(Integer.class.getName()),
	DOUBLE(Double.class.getName()),
	STRING(String.class.getName()),
	IDRELATION(String.class.getName()),
	ENTITYRELATION(null);
	
	private String className;
	
	private DataType(String className){
		this.className = className;
	}

	public String getClassName(){
		return className;
	}
}
