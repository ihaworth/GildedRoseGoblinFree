package com.gildedrose.quality;

import com.gildedrose.Item;

public interface QualityUpdateStrategy
{
	public abstract void updateQuality(Item item);
}