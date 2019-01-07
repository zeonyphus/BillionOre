package xen.billionore.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModArmor {

    public static void init(){

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){

    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){

    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
