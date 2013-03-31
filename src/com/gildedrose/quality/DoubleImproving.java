package com.gildedrose.quality;

import com.gildedrose.Item;

public class DoubleImproving implements QualityUpdateStrategy
{
	@Override
	public void updateQuality(Item item)
	{
		item.incrementQuality();
		item.incrementQuality();
	}
}
