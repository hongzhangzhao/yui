package com.basic;
/*
 *   if(){局部内部类}
 * 
 * 
 * */

interface Destination {
	String readLabel();
}

interface Contents {
	int value();
}

public class Parcel_6 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip { //与if条件无关，与其它类一起编译了
				private String id;

				TrackingSlip(String s) {
					id = s;
				}

				String getSlip() {
					return id;
				}

			}
			TrackingSlip ts = new TrackingSlip("hong");
			String ss = ts.getSlip();
			System.out.println(ss);
		}
		
		// TrackingSlip ts = new TrackingSlip("shadow");//只能在if的作用域内使用
	}
	public void track(){internalTracking(false);}
	
	public static void main(String[] args) {
		Parcel_6 p6 = new Parcel_6();
		p6.track();

	}
}