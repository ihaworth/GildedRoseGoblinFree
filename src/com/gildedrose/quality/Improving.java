package com.gildedrose.quality;

import com.gildedrose.Item;

public class Improving implements QualityUpdateStrategy
{
	@Override
	public void updateQuality(Item item)
	{
		item.incrementQuality();
	}
}
