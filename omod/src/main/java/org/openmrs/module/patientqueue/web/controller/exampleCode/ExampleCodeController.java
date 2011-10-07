/**
 *  Copyright 2011 Health Information Systems Project of India
 *
 *  This file is part of Patient-queue module.
 *
 *  Patient-queue module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Patient-queue module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Patient-queue module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/


package org.openmrs.module.patientqueue.web.controller.exampleCode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p> Class: ExampleCodeController </p>
 * <p> Package: org.openmrs.module.patientqueue.web.controller.exampleCode </p> 
 * <p> Author: Nguyen manh chuyen </p>
 * <p> Update by: Nguyen manh chuyen </p>
 * <p> Version: $1.0 </p>
 * <p> Create date: Jan 26, 2011 5:27:52 PM </p>
 * <p> Update date: Jan 26, 2011 5:27:52 PM </p>
 **/
@Controller("ExampleCodeControllerStandard")
@RequestMapping("/module/patientqueue/example.htm")
public class ExampleCodeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String firstView(Model model) {
		return "/module/patientqueue/exampleCode/example";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model) {
		return "/module/patientqueue/exampleCode/example";
	}

}
