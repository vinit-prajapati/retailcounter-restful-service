package com.mo.retail.store.restapi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility Class
 * 
 * @author vinit-prajapati
 *
 */
public class Utility {
	private static int invoiceSequence = 1;

	private final static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AppConstants.DATE_FORMAT);

	/**
	 * Generated Next Invoice number
	 * 
	 * @return String invoiceNumber
	 */
	public static String getNextInvoiceNumber() {
		return simpleDateFormat.format(new Date()) + invoiceSequence++;
	}

}
