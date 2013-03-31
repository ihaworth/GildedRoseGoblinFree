package com.gildedrose.ageing;

import com.gildedrose.Item;

public class Immortal implements AgeingStrategy
{
	@Override
	public void age(Item item)
	{
		// Immortal items do not age.
	}
}
