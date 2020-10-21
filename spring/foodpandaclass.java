package com.lts.wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FoodPanda {

	@Autowired
    @Qualifier("indian")
	Menu iMenu;
	@Autowired
	@Qualifier("chinese")
	Menu cMenu;
	public void showMenu(String choice) {
		if(choice.equals("Indian")) {
			System.out.println(iMenu.itemAvailable());
		}
		else {
			System.out.println(cMenu.itemAvailable());
		}
	}
}
//////////////////////////////////////////////////
menu interface
package com.lts.wiring;

import java.util.List;

public interface Menu {
	List<String> itemAvailable();

}
