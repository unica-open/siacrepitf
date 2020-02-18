/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacrepser.util.pdf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;

public class PdfUtil {
	public byte[] resizePdf(byte[] pdf, Rectangle size) throws IOException, DocumentException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Rectangle newSize = size;

		PdfReader reader = new PdfReader(pdf);

		Rectangle pageSize = reader.getPageSize(1);

		float width = pageSize.getWidth();
		float height = pageSize.getHeight();

		if (height < width)
			newSize = newSize.rotate();

		Document doc = new Document(newSize, 0, 0, 0, 0);

		PdfWriter writer = PdfWriter.getInstance(doc, baos);

		doc.open();

		PdfContentByte cb = writer.getDirectContent();

		for (int i = 1; i <= reader.getNumberOfPages(); i++) {
			doc.newPage();
			
			PdfImportedPage page = writer.getImportedPage(reader, i);

			float r = Math.min(newSize.getWidth() / page.getWidth(), newSize.getHeight() / page.getHeight());
			
			cb.addTemplate(page, r, 0f, 0f, r, 0f, 0f);
		}
		
		doc.close();

		return baos.toByteArray();
	}

	public int getNumberOfPages(byte[] pdf) throws IOException {
		return new PdfReader(pdf).getNumberOfPages();
	}
	
	
}
