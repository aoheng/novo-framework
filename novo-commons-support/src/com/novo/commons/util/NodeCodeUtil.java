package com.novo.commons.util;

import com.novo.framework.core.exception.SystemException;

public class NodeCodeUtil {
	
	public static String[] splitStringCode(String stringCode,int atomLength) {
		int codeLength = stringCode.length();
		if(atomLength == 0 || codeLength % atomLength != 0) {
			throw new SystemException();
		}
		int stomCount = codeLength / atomLength;
		String[] stoms = new String[stomCount];
		
		for(int index = 0 ; index < stomCount; index++) {
			stoms[index] = stringCode.substring(index*atomLength, (index+1)*atomLength);
		}
		return stoms;
	}
	
}
