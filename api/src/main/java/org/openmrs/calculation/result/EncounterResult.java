/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation.result;

import java.util.Date;

import org.openmrs.Encounter;
import org.openmrs.calculation.Calculation;
import org.openmrs.calculation.api.CalculationContext;

/**
 * Represents a {@link Result} for an {@link Encounter}
 */
public class EncounterResult extends BaseDateBasedResult {
	
	private Encounter value;
	
	/**
	 * Convenience constructor that takes in an {@link Encounter}, {@link Calculation} and
	 * {@link CalculationContext}
	 * 
	 * @param encounter the encounter to set
	 * @param calculation the calculation to set
	 * @param calculationContext the calculationContext to set
	 */
	public EncounterResult(Encounter encounter, Calculation calculation, CalculationContext calculationContext) {
		setValue(encounter);
		setCalculation(calculation);
		setCalculationContext(calculationContext);
	}
	
	/**
	 * @return the value
	 */
	@Override
	public Object getValue() {
		return value;
	}
	
	/**
	 * @param value the value to set
	 */
	public void setValue(Encounter value) {
		this.value = value;
	}
	
	/**
	 * @see org.openmrs.calculation.result.DateBasedResult#getDateOfResult()
	 */
	@Override
	public Date getDateOfResult() {
		if (value != null)
			return value.getEncounterDatetime();
		return null;
	}
	
}
