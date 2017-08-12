package theccb.tfp.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import theccb.tfp.item.CustomItem;

public class ItemInit {
	
	public static Item energon;
	
	public static void init() {
		energon = new CustomItem("energon");
	}
	
	public static void register() {
		registerItem(energon);
	}
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
