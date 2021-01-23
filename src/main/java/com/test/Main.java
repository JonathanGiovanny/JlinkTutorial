package com.test;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Optional<String> value = Optional.of("a");
		List<String> collect = value.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}
}
