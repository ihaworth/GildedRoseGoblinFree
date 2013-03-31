package com.gildedrose.quality;

import com.gildedrose.Item;

public class QuadrupleSpoiling implements QualityUpdateStrategy
{
	@Override
	public void updateQuality(Item item)
	{
		item.decrementQuality();
		item.decrementQuality();
		item.decrementQuality();
		item.decrementQuality();
	}
}
