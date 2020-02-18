/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacrepser.util.xstream;

import com.thoughtworks.xstream.mapper.ClassAliasingMapper;
import com.thoughtworks.xstream.mapper.Mapper;

public class EntitaAliasingMapper extends ClassAliasingMapper {
	public EntitaAliasingMapper(Mapper wrapped) {
		super(wrapped);
	}

	@Override
	public String serializedClass(Class type) {
//		if (Entita.class.isAssignableFrom(type))   
//		{
			String name = type.getSimpleName();
			
			return name.substring(0, 1).toLowerCase() + name.substring(1);
//		}
//
//		return super.serializedClass(type);
	}
	
	
}
