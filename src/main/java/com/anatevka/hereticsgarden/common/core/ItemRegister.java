package com.anatevka.hereticsgarden.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemRegister {
    public static CreativeTabs tabHereticsGarden = new CreativeTabs("tabHereticsGarden") {
        @Override
        public Item getTabIconItem() {
            return Items.diamond;
        }
    };
    public static void init() {
    }
}
