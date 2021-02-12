package utils;

import java.util.HashMap;
import java.util.Map;

import exceptions.InsufficientCreditException;

public class PaymentUtils {
	
	private static Map<String, Double> paymentMap = new HashMap<>();
	
	// Static Block
	static {
		paymentMap.put("account1", 1232.45);
		paymentMap.put("account2", 895.3);
		paymentMap.put("account3", 15092.0);
		paymentMap.put("account4", 11022.5);
	}
	
	public static boolean validateCreditLimit(String accountNumber, double paidAmount) {
		if (paidAmount > paymentMap.get(accountNumber)) {
			throw new InsufficientCreditException("Insufficient Funds!");
		} else
			return true;
	}

}
