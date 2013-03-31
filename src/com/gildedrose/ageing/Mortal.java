package com.gildedrose.ageing;

import com.gildedrose.Item;

public class Mortal implements AgeingStrategy
{
	@Override
	public void age(Item item)
	{
		item.decrementSellIn();
	}
}
