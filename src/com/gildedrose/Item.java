package com.gildedrose;

import com.gildedrose.ageing.AgeingStrategy;
import com.gildedrose.quality.QualityUpdateStrategy;

public class Item
{
    public String name;
    public int sellIn;
    public int quality;

	private AgeingStrategy ageingStrategy;
	private QualityUpdateStrategy preSellIn;
	private QualityUpdateStrategy postSellIn;
    
    public Item(String name, int sellIn, int quality,
    		AgeingStrategy ageingStrategy,
    		QualityUpdateStrategy preSellIn,
    		QualityUpdateStrategy postSellIn)
    {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;

        this.ageingStrategy = ageingStrategy;
		this.preSellIn = preSellIn;
		this.postSellIn = postSellIn;
    }
    
    public String toString()
    {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

	void update()
	{	
		if (preSellIn())
			preSellIn.updateQuality(this);
		else
			postSellIn.updateQuality(this);

		ageingStrategy.age(this);
	}

	private boolean preSellIn()
	{
		return sellIn > 0;
	}

	public void incrementQuality()
	{
		if (quality < 50)
		    quality++;
	}

	public void decrementQuality()
	{
		if (quality > 0)
			quality--;
	}

	public void decrementSellIn()
	{
		sellIn--;
	}

	public void zeroQuality()
	{
		quality = 0;
	}

	public boolean sellInNDaysOrFewer(int numDays)
	{
		return sellIn <= numDays;
	}

	public boolean sellIn10DaysOrFewer()
	{
		return sellInNDaysOrFewer(10);
	}

	public boolean sellIn5DaysOrFewer()
	{
		return sellInNDaysOrFewer(5);
	}
}
