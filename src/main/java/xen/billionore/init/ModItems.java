package xen.billionore.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import xen.billionore.BillionOre;
import xen.billionore.items.ItemBasic;

@Mod.EventBusSubscriber(modid = BillionOre.MODID)
public class ModItems {

    public static Item molybdenumIngot;

    public static void init(){

        molybdenumIngot = new ItemBasic("molybdenum_ingot").setCreativeTab(ModBlocks.tabBillionOre);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().register(molybdenumIngot);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(molybdenumIngot);
    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
