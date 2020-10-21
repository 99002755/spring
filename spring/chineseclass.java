chinese class
package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
package com.lts.wiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements Menu {

	@Override
	public List<String> itemAvailable() {
		// TODO Auto-generated method stub
		return Arrays.asList("Fries rice","Noodles");
	}

}
/////////////////////////////////////////
indian class
package com.lts.wiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements Menu {

	@Override
	public List<String> itemAvailable() {
		// TODO Auto-generated method stub
		return Arrays.asList("rice","Dal");
	}

}

