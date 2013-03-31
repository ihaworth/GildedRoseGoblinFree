package com.gildedrose.quality;

import com.gildedrose.Item;

public class BackstagePassPreSellIn implements QualityUpdateStrategy
{
	@Override
	public void updateQuality(Item item)
	{
		if (item.sellIn5DaysOrFewer())
		{
			item.incrementQuality();
			item.incrementQuality();
			item.incrementQuality();
		}
		else if (item.sellIn10DaysOrFewer())
		{
			item.incrementQuality();
			item.incrementQuality();
		}
		else
		{
			item.incrementQuality();
		}
	}
}
