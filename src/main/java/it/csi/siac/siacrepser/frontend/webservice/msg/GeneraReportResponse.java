/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacrepser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.file.File;
import it.csi.siac.siacrepser.frontend.webservice.REPSvcDictionary;

@Deprecated
@XmlType(namespace = REPSvcDictionary.NAMESPACE)
public class GeneraReportResponse extends ServiceResponse {
	private Integer numeroPagineGenerate;
	
	private File report;

	public Integer getNumeroPagineGenerate() {
		return numeroPagineGenerate;
	}

	public void setNumeroPagineGenerate(Integer numeroPagineGenerate) {
		this.numeroPagineGenerate = numeroPagineGenerate;
	}

	public File getReport() {
		return report;
	}

	public void setReport(File report) {
		this.report = report;
	}

	
	
	
	
}
