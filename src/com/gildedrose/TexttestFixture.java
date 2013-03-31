package com.gildedrose;

import com.gildedrose.ageing.Mortal;
import com.gildedrose.ageing.Immortal;
import com.gildedrose.quality.BackstagePassPreSellIn;
import com.gildedrose.quality.DoubleImproving;
import com.gildedrose.quality.DoubleSpoiling;
import com.gildedrose.quality.Improving;
import com.gildedrose.quality.QuadrupleSpoiling;
import com.gildedrose.quality.Spoiling;
import com.gildedrose.quality.Undiminishing;
import com.gildedrose.quality.Worthless;

public class TexttestFixture {
    public static void main(String[] args) {
		System.out.println("OMGHAI!");

		Item[] items = new Item[] { createStandardItem("+5 Dexterity Vest", 20, 10),
				createAgedBrie(2, 0),
				createStandardItem("Elixir of the Mongoose", 7, 5),
				createSulfuras(0, 80),
				createSulfuras(-1, 80),
				createBackstagePass(15, 20),
				createBackstagePass(10, 49),
				createBackstagePass(5, 49),
				createConjuredManaCake(3, 6) };

		GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length == 1) {
            days = Integer.parseInt(args[0]) + 1;
        }
        
        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
    		app.updateQuality();
        }
	}

	private static Item createConjuredManaCake(int sellIn, int quality)
	{
		return new Item("Conjured Mana Cake", sellIn, quality, new Mortal(),
				new DoubleSpoiling(), new QuadrupleSpoiling());
	}

	private static Item createStandardItem(String name, int quality, int sellIn)
	{
		return new Item(name, sellIn, quality, new Mortal(),
				new Spoiling(), new DoubleSpoiling());
	}

	private static Item createAgedBrie(int sellIn, int quality)
	{
		return new Item("Aged Brie", sellIn, quality, new Mortal(),
				new Improving(), new DoubleImproving());
	}

	private static Item createSulfuras(int sellIn, int quality)
	{
		return new Item("Sulfuras, Hand of Ragnaros", sellIn, quality, new Immortal(),
				new Undiminishing(), new Undiminishing());
	}

	private static Item createBackstagePass(int sellIn, int quality)
	{
		return new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality, new Mortal(),
				new BackstagePassPreSellIn(), new Worthless());
	}
}
