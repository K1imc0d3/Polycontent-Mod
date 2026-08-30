package name.k1imc0d3.polycontent.Block;

import name.k1imc0d3.polycontent.Polycontent;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {
    public static final LanternBlock GOLDEN_LANTERN = Registry.register(Registries.BLOCK, Identifier.of(Polycontent.MODID, "golden_lantern"), new LanternBlock(AbstractBlock.Settings.create().nonOpaque().strength(1).luminance(state -> 15)));
    public static final ChainBlock GOLDEN_CHAIN = Registry.register(Registries.BLOCK, Identifier.of(Polycontent.MODID, "golden_chain"), new ChainBlock(AbstractBlock.Settings.create().nonOpaque()));
    public static final Block SWEET_BERRY_BLOCK = registerBlock("sweet_berry_block",
            new Block(AbstractBlock.Settings.create().burnable().nonOpaque()));
    public static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Polycontent.MODID, name), block);
    }
    public static void registerModBlocks() {

    }
}
