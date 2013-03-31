package com.gildedrose.quality;

import com.gildedrose.Item;

public class Spoiling implements QualityUpdateStrategy
{
	@Override
	public void updateQuality(Item item)
	{
		item.decrementQuality();
	}
}
