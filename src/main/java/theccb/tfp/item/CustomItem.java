package theccb.tfp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomItem extends Item {
	
	public CustomItem(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
	}

}
