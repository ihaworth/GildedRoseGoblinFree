package com.gildedrose.quality;

import com.gildedrose.Item;

public class Worthless implements QualityUpdateStrategy
{
	@Override
	public void updateQuality(Item item)
	{
		item.zeroQuality();
	}
}
