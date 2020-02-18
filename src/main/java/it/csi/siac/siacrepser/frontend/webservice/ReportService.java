/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacrepser.frontend.webservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacrepser.frontend.webservice.msg.GeneraReport;
import it.csi.siac.siacrepser.frontend.webservice.msg.GeneraReportResponse;

@Deprecated
@WebService(targetNamespace = REPSvcDictionary.NAMESPACE, name = "ReportService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ReportService {
	@WebMethod
	@Oneway
	void generaReportAsync(GeneraReport arg);
	
	@WebMethod
	GeneraReportResponse generaReport(GeneraReport arg);
}
