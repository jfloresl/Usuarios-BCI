package com.jfloresl.usuarios.utils;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jfloresl.usuarios.entities.Phone;

@Service
public class UserUtils {
	public static boolean isNullOrEmpty(String str) {
	    return str == null || str.isEmpty();
	}

	public static boolean isNullOrEmpty(List<Phone> phones) {
		return phones == null || phones.size()==0;
	}

	public static boolean isNumber(String str) {
		return str.matches(Constantes.numberValid) ;
	}
}
