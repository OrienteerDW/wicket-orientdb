package ru.ydn.wicket.wicketorientdb.model;

import org.apache.wicket.model.IModel;

import com.orientechnologies.orient.core.metadata.schema.OClass;

public class OClassNamingModel extends AbstractNamingModel<OClass> {

	public OClassNamingModel(OClass oClass)
	{
		super(oClass);
	}
	
	public OClassNamingModel(IModel<OClass> objectModel) {
		super(objectModel);
	}

	@Override
	public String getResourceKey(OClass object) {
		return object.getName();
	}

}
