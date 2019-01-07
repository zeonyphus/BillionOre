package xen.billionore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;
import xen.billionore.init.ModArmor;
import xen.billionore.init.ModBlocks;
import xen.billionore.init.ModItems;
import xen.billionore.init.ModRecipes;
import xen.billionore.worldgen.OreGen;

@Mod(modid = xen.billionore.BillionOre.MODID, name = xen.billionore.BillionOre.NAME, version = xen.billionore.BillionOre.VERSION, acceptedMinecraftVersions = xen.billionore.BillionOre.ACCEPTED_MINECRAFT_VERSIONS)
public class BillionOre {

    public static final String MODID = "billionore";
    public static final String NAME = "Billion Ore";
    public static final String VERSION = "0.1";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12]";

    private static Logger logger;

    @Mod.Instance
    public static BillionOre instance;

    /*
    @SidedProxy(clientSide = "xen.modone.proxy.ClientProxy",
            serverSide = "xen.modone.proxy.ServerProxy")
    public static IProxy proxy;
    */

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(BillionOre.MODID + ":preInit");
        logger = event.getModLog();
        ModItems.init();
        ModArmor.init();
        ModBlocks.init();
        ModRecipes.init();
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(BillionOre.MODID + ":init");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(BillionOre.MODID + ":postInit");
    }
}
