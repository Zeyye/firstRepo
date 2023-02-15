package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultipleSelectDropdown extends BaseClass {

	public static void main(String[] args) {

		// http://uitestpractice.com/Students/Select

		setUp();

		WebElement multiSelect = driver.findElement(By.id("countriesMultiple"));

		// create a Select object

		Select sel = new Select(multiSelect);

		// check if teh dropdown allows multiple selection

		boolean isMlp = sel.isMultiple();

		System.out.println("Is this multiple select ? " + isMlp);

		tearDown();

	}

}
