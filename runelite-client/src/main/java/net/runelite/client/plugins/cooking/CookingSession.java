/*
 * Copyright (c) 2018, Joris K <kjorisje@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.cooking;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;

public class CookingSession
{
	private Instant startCooking;
	private Instant lastCookingAction;
	private int cookAmount;
	private int burnAmount;

	public void reset(boolean keepStatistics)
	{
		lastCookingAction = null;
		if (!keepStatistics)
		{
			startCooking = null;
			cookAmount = 0;
			burnAmount = 0;
		}
	}

	public void setStartCooking()
	{
		this.startCooking = Instant.now();
	}

	public Instant getStartCooking()
	{
		return startCooking;
	}

	public void setLastCookingAction()
	{
		this.lastCookingAction = Instant.now();
	}

	public Instant getLastCookingAction()
	{
		return lastCookingAction;
	}

	public void increaseBurnAmount()
	{
		this.burnAmount++;
	}

	public int getBurnAmount()
	{
		return burnAmount;
	}

	public String getBurntPercentage()
	{
		return new DecimalFormat("#.#").format(((double) getBurnAmount() / (getCookAmount() + getBurnAmount())) * 100);
	}

	public void increaseCookAmount()
	{
		this.cookAmount++;
	}

	public int getCookAmount()
	{
		return cookAmount;
	}

	public Duration getSessionTime()
	{
		return Duration.between(getStartCooking(), Instant.now());
	}

	public long getActionsPerHour()
	{
		return (int) (((double) getCookAmount() / getSessionTime().getSeconds()) * 3600);
	}
}