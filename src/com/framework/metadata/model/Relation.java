/**
 * 
 */
package com.framework.metadata.model;

/**
 * @author HWYan
 *
 */
public class Relation extends ModelElement{
	
	private RelationType type = RelationType.ASSOCIATION;
	
	private Entity relatedEntity;

	public void setRelatedEntity(Entity relatedEntity) {
		this.relatedEntity = relatedEntity;
	}

	public Entity getRelatedEntity() {
		return relatedEntity;
	}

	public RelationType getType() {
		return type;
	}

	public void setType(RelationType type) {
		this.type = type;
	}

}
