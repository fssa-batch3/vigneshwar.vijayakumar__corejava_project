package day06.solved;

//Convert Arrays to List

import java.util.List;
import java.util.Arrays;

public class ConvertArraysToList {
	public static void main(String[] args) {
		String[] deptNames = new String[3];
		deptNames[0] = "CSE";
		deptNames[1] = "EEE";
		deptNames[2] = "MECH";
		List<String> list = Arrays.asList(deptNames);
		System.out.println(list);
	}
}