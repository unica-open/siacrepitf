/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacrepser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequest;
import it.csi.siac.siacrepser.frontend.webservice.REPSvcDictionary;
import it.csi.siac.siacrepser.util.xstream.XStreamUtil;

@Deprecated
@XmlType(namespace = REPSvcDictionary.NAMESPACE)
public class GeneraReport extends AsyncServiceRequest {
	private String objectXml;
	private String codiceTemplate;

	public void initObjectXml(Object object) {
		XStreamUtil xStreamUtil = new XStreamUtil();

		setObjectXml(xStreamUtil.objectToXml(object));
	}

	public String getObjectXml() {
		return objectXml;
	}

	public void setObjectXml(String objectXml) {
		this.objectXml = objectXml;
	}

	public String getCodiceTemplate() {
		return codiceTemplate;
	}

	public void setCodiceTemplate(String codiceTemplate) {
		this.codiceTemplate = codiceTemplate;
	}

}
