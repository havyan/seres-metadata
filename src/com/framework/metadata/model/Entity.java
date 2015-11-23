/**
 * 
 */
package com.framework.metadata.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author HWYan
 * 
 */
public class Entity extends ModelElement {

	private Attribute[] attributes;
	
	private Entity superEntity;

	public Attribute getAttribute(String name) {
		for (Attribute attribute : getAttributes()) {
			if (attribute.getName().equals(name)) {
				return attribute;
			}
		}

		return null;
	}
	
	public Relation getRelation(String name){
		return getAttribute(name).getRelation();
	}

	public Attribute[] getRelatedAttributes() {
		List<Attribute> relatedAttributes = new ArrayList<Attribute>();
		for (Attribute attribute : getAttributes()) {
			if (attribute.getRelation() != null) {
				relatedAttributes.add(attribute);
			}
		}

		return relatedAttributes.toArray(new Attribute[0]);
	}

	public Attribute[] getRelatedAttributes(RelationType relationType) {
		List<Attribute> relatedAttributes = new ArrayList<Attribute>();
		for (Attribute attribute : getAttributes()) {
			if (attribute.getRelation() != null && attribute.getRelation().getType() == relationType) {
				relatedAttributes.add(attribute);
			}
		}

		return relatedAttributes.toArray(new Attribute[0]);
	}
	
	public Entity getSuperEntity(){
		return superEntity;
	}
	
	public Attribute[] getAttributes() {
		if(superEntity != null){
			List<Attribute> allAttributes = new ArrayList<Attribute>();
			allAttributes.addAll(Arrays.asList(superEntity.getAttributes()));
			allAttributes.addAll(Arrays.asList(attributes));
			return allAttributes.toArray(new Attribute[0]);
		}
		
		return attributes;
	}

	public void setAttributes(Attribute[] attributes) {
		this.attributes = attributes;
	}

}
