package xen.billionore.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xen.billionore.blocks.BlockOre;

public class ModBlocks {

    public static Block molybdeniteOre;

    static final CreativeTabs tabBillionOre = (new CreativeTabs("tabBillionOre") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(ModItems.molybdenumIngot); }
    });

    public static void init(){

        molybdeniteOre = new BlockOre("molybdenite_ore", Material.ROCK, Item.getItemFromBlock(molybdeniteOre),1, 5).setCreativeTab(tabBillionOre  );

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().register(molybdeniteOre);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new ItemBlock(molybdeniteOre).setRegistryName(molybdeniteOre.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(Item.getItemFromBlock(molybdeniteOre));
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
