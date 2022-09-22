package com.seleniumprojects.flightbooking;

public class Sample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ReadJsonData readjsondata = new ReadJsonData();

		System.out.println("hi");
		ReadJsonData.readData();
		System.out.println(ReadJsonData.destination+","+ ReadJsonData.origin +","+ ReadJsonData.destination);

	}

}
