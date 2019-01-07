package xen.billionore.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init(){
        GameRegistry.addSmelting(ModBlocks.molybdeniteOre, new ItemStack(ModItems.molybdenumIngot, 1), 5.0f);
    }

}
