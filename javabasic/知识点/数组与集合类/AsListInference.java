package com.basic;

import java.util.Arrays;
import java.util.*;

/* 
 * - 显示类型参数说明
 * 
 * */

class Snow {}

class Crusty extends Snow {}
class Slush extends Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}




public class AsListInference {

	public static void main(String[] args) {
		
		List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());
		
		List<Snow> snow2 = Arrays.asList(new Light(),new Heavy());//返回的是List<Powder>
		
		
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(),new Heavy());
		
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(),new Heavy());//明确类型是<Snow>
		
	}
}